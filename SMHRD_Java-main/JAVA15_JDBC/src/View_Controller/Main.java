package View_Controller;

import java.util.ArrayList;
import java.util.Scanner;

import Model.StudentDAO;
import Model.StudentVO;

public class Main {

	public static void main(String[] args) {

		// ctrl+shif+o -> 전체 import
		// ctrl+space ->특정 클래스 import
		StudentDAO dao = new StudentDAO();
		Scanner sc = new Scanner(System.in);

		System.out.println("========================SMHRD학생관리프로그램========================");

		while (true) {

			System.out.println("1.학생추가 2.전체명단조회 3.특정학생조회 4.학생정보수정 5.학생삭제 6.프로그램종료 ");
			System.out.print("메뉴선택 >> ");
			System.out.println();
			int meun = sc.nextInt();

			if (meun == 1) {
				System.out.println("등록할 학생의 정보를 입력하시오");
				System.out.print("이름:");
				String name = sc.next();
				System.out.print("나이:");
				int age = sc.nextInt();
				System.out.print("전화번호:");
				String tel = sc.next();
				System.out.print("이메일:");
				String email = sc.next();

				boolean check = dao.insertStd(name, age, tel, email);

				if (check == true) {
					System.out.println("학생 정보 추가 성공했습니다.");
				} else {
					System.out.println("학생 정보 추가 실패했습니다.");
				}

			} else if (meun == 2) {

				ArrayList<StudentVO> al = dao.selectStds(); // 호출

				for (StudentVO vo : al) {
					System.out.println("===========================");
					System.out.println("학생번호 : " + vo.getNum());
					System.out.println("학생이름 : " + vo.getName());
					System.out.println("학생나이 : " + vo.getAge());
					System.out.println("학생전화번호 : " + vo.getTel());
					System.out.println("학생이메일 : " + vo.getEmail());

				}

//				for(int i=0; i<al.size(); i++) {
//					
//					System.out.println("===========================");
//					System.out.println("학생번호 : " + al.get(i).getNum());
//					System.out.println("학생이름 : " + al.get(i).getName());
//					System.out.println("학생나이 : " + al.get(i).getAge());
//					System.out.println("학생전화번호 : " + al.get(i).getTel());
//					System.out.println("학생이메일 : " + al.get(i).getEmail());
//				}

			} else if (meun == 3) {
				// 1. 학생번호 검색(입력)
				System.out.print("학생 번호 입력: ");
				int num = sc.nextInt();
				// 2. DAO객체가 가지고 있는 selectOneStd() 호출 -> StuentVO 반환
				StudentVO vo = dao.selectOnestd(num);
				// 입력된 학생번호가 Student table의 num 컬럼값으로 존재하는 경우에는
				// StudentVO 객체가 생성됨
				// 존재하지 않는 경우에는 객체가 생성이 되지 않고 초기화값인 null이 반환됨

				if (vo != null) {
					System.out.println("===========================");
					System.out.println("학생번호 : " + vo.getNum());
					System.out.println("학생이름 : " + vo.getName());
					System.out.println("학생나이 : " + vo.getAge());
					System.out.println("학생전화번호 : " + vo.getTel());
					System.out.println("학생이메일 : " + vo.getEmail());
				} else {
					// vo가 null인경우
					System.out.println("해당 학생은 우리 학교생이 아닙니다. 다시 입력해주세요.");
				}

			} else if (meun == 4) {

				System.out.print("수정할 학생의 번호 입력 : ");
				int num = sc.nextInt();

				StudentVO vo = dao.selectOnestd(num);

				// 입력된 학생번호가 Student table의 num 컬럼값으로 존재하는 경우에는
				// StudentVO 객체가 생성됨
				// 존재하지 않는 경우에는 객체가 생성이 되지 않고 초기화값인 null이 반환됨

				if (vo != null) {
					System.out.println("===========================");
					System.out.println("학생번호 : " + vo.getNum());
					System.out.println("학생이름 : " + vo.getName());
					System.out.println("학생나이 : " + vo.getAge());
					System.out.println("학생전화번호 : " + vo.getTel());
					System.out.println("학생이메일 : " + vo.getEmail());

					System.out.println();
					System.out.print("수정할 정보 선택(1.전화번호, 2.이메일) : ");
					int select_num = sc.nextInt();
					if (select_num == 1) {
						System.out.print("수정할 번호: ");
						String update_phone = sc.next();

						boolean check = dao.updatePhone(num, update_phone);

						if (check == true) {
							System.out.println("학생 번호 수정 성공했습니다.");
						} else {
							System.out.println("학생 번호 수정 실패했습니다.");
						}

					} else if (select_num == 2) {
						System.out.print("수정할 이메일: ");
						String update_email = sc.next();

						boolean check = dao.updatemail(num, update_email);

						if (check == true) {
							System.out.println("학생 메일 수정 성공했습니다.");
						} else {
							System.out.println("학생 메일 수정 실패했습니다.");
						}

					}

				} else {
					// vo가 null인경우
					System.out.println("해당 학생은 우리 학교생이 아닙니다. 다시 입력해주세요.");
				}
			} else if (meun == 5) {

				System.out.print("삭제할 학생 번호 입력: ");
				int num = sc.nextInt();

				boolean check = dao.deleteStd(num);

				if (check == true) {
					System.out.println("학생 삭제 성공했습니다.");
				} else {
					System.out.println("학생 삭제 실패했습니다.");
				}

			} else if (meun == 6) {
				System.out.println("종료");
				break;
			}

		}
	}
}
