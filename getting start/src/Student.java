public class Student {
        private String studentName;
        private int studentAge;
        private String studentGender;

        public void setInfo(String name, int age, String gender) {
            if (name == null || age < 0 || gender == null ){
                System.out.println("please input correct student info");
            }else{
                this.studentName = name;
                this.studentAge = age;
                this.studentGender = gender;
            }

        }
        public String getName(){
            return studentName;
        }
        public String getGender(){
            return studentGender;
        }
        public int getAge(){
            return studentAge;
        }

}
