package j19_컬렉션;

import lombok.AllArgsConstructor;
import lombok.Data;
// 컨트롤 쉽프트 o 안쓰는거 자동삭제

//@RequiredArgsConstructor //필수  생성자
// @NoArgsConstructor //생성자의 매개변수가 없다 (기본 생성자)
//@Getter
//@Setter
//@EqualsAndHashCode
//@ToString
@AllArgsConstructor //전체 생성자
@Data 
public class Student {
	private String name; // 이름 
	private int year; // 학년
//	private final String address; //final 필수
}
