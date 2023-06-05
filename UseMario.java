/*
우리가 작성한 mario.java를 컴파일하면 기계어로 구성된 mario.class가 생성되어짐
따라서, 마리오 객체의 인스턴스를 생성하기위해서는 mario.class를 사용하는 실행부있는 자바소스를 작성해야함
js는 웹브라우저만 있으면 언어를 실행할 수 있는, 즉 독립적인 실행이 불가능하며 브라우저에 의존하는 언어이지만,
java는 그 어떤 프로그램에도 의존하지 않는 독립프로그램임
따라서 실행하기위해서는 현재 java 소스 내 실행을 위하 main함수만 정의하면됨.
*/
class UseMario{
	//자바나 c#, c등의 언어는 실행을 위한 메인 함수를 지원하는데 자바에서도 main을 지원하며 main메서드라 불림
	public static void main(String[] args){
		System.out.println("Choi Seung Ah");
	}
} 
