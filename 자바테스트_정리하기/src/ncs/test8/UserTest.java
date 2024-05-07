package ncs.test8;

public class UserTest {
	
	public static void main(String[] args) {
		//User 객체를 담을 수 잇는 배열 선djs
		User[] users = new User[3];
		
		//3개의 User 객체 생성해서 배열에 넣기
		users[0] = new User("user01", "비번1","김철수",32,'M',"010-1234-5678");
		users[1] = new User("user01", "비번2","이영희",25,'F',"010-5555-7777");
		users[2] = new User("user01", "비번3","황진이",20,'F',"010-9874-5632");
	
		// Users에 담긴 배열들 모두 출력
		for(User user : users) {
			System.out.println(user.toString());
		}
		//내가 만든 유저 정보를 그대로 복사해서 복사가 잘 되었느닞 출력
		User[] 유저복사 = new User[users.length];
		//유저를 처음부터 끝까지 모두복사
		for(int i = 0;i < users.length;i++) {
			유저복사[i] = users[i].clone(); //유저 복사
			System.out.println(유저복사[i].toString());
		}
		
	}
}
