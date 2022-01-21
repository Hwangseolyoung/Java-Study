package day01;
// 변수(Variable)

// 프로그래밍에서의 변수는 내부에 저장된 값을 
// 필요할 때마다 새로운 값을 저장하여
// 덮어씌울 수 있는 공간을 변수라고 한다.

// 변수는 우리가 사용하기 위해서는
// 반드시 선언과 초기화 라는 단계를 거쳐야한다.

// 선언(declaration)
// 선언이란, 우리가 특정 공간을 마련하여
// 그 공간을 접근할 수 있는 이름과 어떠한 종류의 값이 저장될 수 있는지를
// 지정하는 코드이다.
// 변수의 선언은 다음과 같이 이루어진다.
// 데이터타입 변수이름;
// 데이터타입: 해당 공간에 어떤 종류의 값이 저장될수 있는지를 지정하는 키워드 혹은 클래스의 이름.
// 변수이름: 소문자로 시작하고 낙타등 표기법을 사용하는 명사. 
//         해당 공간에 새로운 값을 저장하거나 저장되어 있는 값을 불러올때 사용한다.
// 단, 동일한 이름의 변수는 같은 유효범위 안에서는 또 선언할 수 없다.(=중복 선언 불가)

// 초기화(initialization)
// 변수는 선언된 후에는 반드시 한번이라도 값이 할당되어야 사용이 가능하다.
// 이렇게 맨처음 값을 할당하는 것을 초기화라고 부른다.
// 변수의 초기화 방법은 두가지 방법이 있다.
// 이미 선언되어 있는 변수의 경우에는
// 변수이름 = 값;
// 으로 초기화가 가능하고, 
// 만약 선언되어 있지 않은 변수는
// 선언과 초기화를 한줄로 묶어서
// 데이터타입 변수이름 = 값;
// 으로 선언과 초기화를 한번에 해줄 수도 있다.

public class Ex04Variable {
	public static void main(String[] args) {
		// int 변수 number의 선언
		int number;

		// number에 20을 저장해보자
		number = 20;

		// number에 현재 저장된 값을 출력해보자
		System.out.println("number의 현재 값");
		// 아랫줄의 의미는 변수 number의 현재 저장된 값을
		// 화면에 출력하라는 의미가 된다.
		System.out.println(number);

		// number에 새로운 값 25를 저장해보자
		number = 25;

		// number에 현재 저장된 값을 출력해보자
		System.out.println("number의 현재 값");
		System.out.println(number);

		// 이미 37번 라인에서
		// number라는 이름의 변수를 선언하였기 때문에
		// 똑같은 이름의 변수는 선언할 수 없다.
		// int number = 30;

	}
}
