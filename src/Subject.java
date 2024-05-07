
public class Subject {
    private int subjectNum; //고유 번호
    private String subjectName; // 과목명
    private SubjectCode subjectType; //과목타입
    private int subjectRound;//과목 회차


    public int getSubjectNum() {
        return subjectNum;
    }

    public String getSubjectName() {
        return subjectName;
    }

    public SubjectCode getSubjectType() {
        return subjectType;
    }


    public int getSubjectRound() {
        return subjectRound;
    }


    public Subject(int subjectNum, String subjectName, SubjectCode subjectType, int subjectRound) {
        this.subjectNum = subjectNum;
        this.subjectName = subjectName;
        this.subjectType = subjectType;
        this.subjectRound = subjectRound;
    }

    //과목명 수정 매서드

    public void updateSubjectName(String newSubjectName) {
        SubjectList[] subjectLists = SubjectList.values();
        for (SubjectList subjectList : subjectLists) {
            if (subjectList.name().equals(newSubjectName)) {
                this.subjectName = newSubjectName;

                if (subjectList.name().equals("Java")) {
                    this.subjectType = SubjectCode.MANDATORY; //enum에서 직접 참조
                } else if (subjectList.name().equals("객체지향")) {
                    this.subjectType = SubjectCode.MANDATORY;
                } else if (subjectList.name().equals("Spring")) {
                    this.subjectType = SubjectCode.MANDATORY;
                } else if (subjectList.name().equals("JPA")) {
                    this.subjectType = SubjectCode.MANDATORY;
                } else if (subjectList.name().equals("MySQL")) {
                    this.subjectType = SubjectCode.MANDATORY;
                } else if (subjectList.name().equals("디자인패턴")) {
                    this.subjectType = SubjectCode.CHOICE;
                } else if (subjectList.name().equals("SpringSecurity")) {
                    this.subjectType = SubjectCode.CHOICE;
                } else if (subjectList.name().equals("Redis")) {
                    this.subjectType = SubjectCode.CHOICE;
                } else if (subjectList.name().equals("MongoDB")) {
                    this.subjectType = SubjectCode.CHOICE;
                }
                //this.subjectNum="SU"+this.subjectName+this.subjectType
            }
        }

        //고유 번호 수정 매서드 (필수 X)

    }
}


