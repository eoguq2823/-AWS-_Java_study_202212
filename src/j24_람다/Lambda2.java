package j24_람다;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Lambda2 {

	public static void main(String[] args) {
		
//		1. Runnable - void run()
		Runnable a = () -> System.out.println("실행");
		Runnable b = () -> {
			System.out.print("여");
			System.out.print("러");
			System.out.print("명");
			System.out.print("령");
			System.out.print("실");
			System.out.println("행");
		};
		
		a.run();
		a.run();
		b.run();
		b.run();
		
//		2. Supplier<T> - T get()
		Supplier<LocalDate> c = () -> LocalDate.now();
		Supplier<String> d = () -> {
			LocalDate now = LocalDate.now();
			return now.format(DateTimeFormatter.ofPattern("yyyy년 MM월 dd일"));
		};
		System.out.println(c.get());
		System.out.println(d.get());
		
//		3. Consumer<T> - void accept(T t)
		Consumer<String> e = name -> {
		System.out.println("이름: " + name);
		System.out.println("오늘 날짜: " + d.get());
		};
		e.accept("이종현");
		
		//메소드 참조 표현식 ([인스턴스] :: [메소드명 또는 new(생성자명)])
		Consumer<String> f = System.out :: println;
		f.accept("출력");
	
		List<String> names = new ArrayList<>();
		names.add("김동민");
		names.add("김두영");
		names.add("장진원");
		names.add("조병철");
		
		//froEach 안에 Consumer이라는 매개변수가 들어가 있기 때문에 사용이 가능하다.
		names.forEach(name -> System.out.println("이름: " + name + "님"));
		//풀어쓰면
		Consumer<String> g = name -> System.out.println("이름: " + name + "님");
		names.forEach(g);
		
		names.forEach(name -> {
			System.out.println("이름을 출력합니다.");
			System.out.println("이름: " + name);
			System.out.println();
		});
//		forEach타고들어가면
//		default void forEach(Consumer<? super T> action) {
//	        Objects.requireNonNull(action);
//	        for (T t : this) {
//	            action.accept(t);
//	       }
//	    }
		Map<String, String> userMap = new HashMap<>();
		userMap.put("username", "aaa");
		userMap.put("password", "1234");
		
		userMap.forEach((key, value) -> {
			System.out.println("key: " + key);
			System.out.println("value: " + value);
			System.out.println();
		});
		//풀어쓰면이렇게된다.
		for(Entry<String, String> entry : userMap.entrySet()) {
			System.out.println("key; " + entry.getKey());
			System.out.println("value; " + entry.getValue());
			System.out.println();
		}
		
		//4. Function<R, T>
		Function<String, Integer> h = num -> Integer.parseInt(num);
		
		int convertStrNum1 = h.apply("10000"); //10000을 위에 num에 넣고 Integer해줌으로써 자료형을 바꿔줌
		int convertStrNum2 = h.apply("20000");
		
		System.out.println(convertStrNum1 + convertStrNum2);
		System.out.println();
		
		//5. Predicate<T>
		Predicate<String> p = str -> str.startsWith("김");
		Predicate<String> p2 = str -> str.startsWith("이");
		
		System.out.println(p.test("김준일") || p2.test("이현수")); //T
		System.out.println(p.test("김준일") || p2.test("김준일")); //T
		System.out.println(p.test("이현수") || p2.test("이현수")); //T
		
		System.out.println(p.or(p2).test("김준일")); // 위에랑 똑같음
		System.out.println();
		Function<Predicate<String>, Boolean> function1 = 
				predicate -> predicate.or(str -> str.startsWith("이")).test("김준일");

		boolean rs = function1.apply(str -> str.startsWith("김"));
		System.out.println(rs);
		
		List<String> nameList = new ArrayList<>();
		nameList.add("김종환");
		nameList.add("고병수");
		nameList.add("김상현");
		nameList.add("김준경");
		//리스트를 스트림이로 바꾸고(스트림 객체 생성)
		//스트림은 1회용 
		Stream<String> stream = nameList.stream().filter(name -> name.startsWith("김"));
		//트루인 "김"이 들어간 것만 뽑아준다.
//		stream.forEach(name -> System.out.println(name)); //포이치
		//최종적으로 스트림을 리스트로 바꾸기
		List<String> newList = stream.collect(Collectors.toList());
		System.out.println(newList);
		System.out.println();
		//한줄표현
		nameList.stream()
			.filter(name -> name.startsWith("김"))
			.collect(Collectors.toList())
			.forEach(System.out::println); //(name -> sysout(name)); 이랑 같음
	}
} 
