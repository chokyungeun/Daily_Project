#### * TEACHER TABLE

- TEACHER_CODE : 선생님코드 PK
- TEACHER_ID : 선생님아이디
- TEACHER_NAME : 선생님이름
- TEACHER_HP : 선생님전화번호

#### * STUDENT TABLE

- STUDENT_ACCOUNT : 학생계정
- STUDENT_NAME : 이름
- STUDENT_HP : 전화번호
- STUDENT_AGE : 학생나이
- STUDENT_GENDER : 성별
- STUDENT_CURRICULUM : 기수
- STUDENT_REGION : 지역
- STUDENT_GROUP : 반
- REG_DT : 등록일
- LAST_DT : 수정일
- ALGORITHM_GRADE : 알고리즘성적
- ALGORITHM_ACQUISITION_DATE : 취득일
- TEAM_CODE : 팀코드 FK
- TEACHER_CODE : 선생님 코드 FK
- STUDENT_CODE : 학생코드 PK

#### * EXAM TABLE

- STUDENT_CODE : 학생코드 FK
- EXAM_CODE : 시험코드
- EXAM_SCORE : 시험성적

#### * ATTENDANCE TABLE

- STUDENT_CODE : 학생코드 FK 
- ATTENDACE_DATE : 날짜
- ATTENDANCE : 출석여부
- ATTENDANCE_SIGN_IN : 입실시간
- ATTENDANCE_SIGN_OUT : 퇴실시간

#### * PROJECT TABLE

- TEAM_CODE : 팀코드 PK
- TEAM_NAME : 팀이름
- PROJECT_NAME : 프로젝트제목
- LEADER_CODE : 팀장번호
- SCORE : 성적



선생님, 시험성적, 출석, 프로젝트 테이블을 따로 관리하기로 하였습니다.
출석 여부를 확인할때는 ATTENDANCE TABLE만 확인하면 되도록 설계했습니다.
MySQL 설치하는데만 3시간이 넘게 걸렸습니다.
컴퓨터 이름이 한글로 되어있어서 계속 에러가 나고 설치가 되지 않았습니다.
그래서 시간이 굉장히 많이 부족하였습니다.
프로그램이 먼저 설치되어있었다면 더 퀄리티 높은 과제를 할 수 있었을 것 같아 아쉬웠습니다.