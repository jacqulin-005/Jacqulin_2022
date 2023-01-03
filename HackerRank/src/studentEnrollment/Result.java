package studentEnrollment;

class Result extends Student {
    int subject1;
    int subject2;
    int subject3;
    
    Result(int a , int b, int c, String s, int sClass) {
        super(s, sClass);
        this.name = s;
        this.studentClass = sClass;
        this.subject1 = a;
        this.subject2 = b;
        this.subject3 = c;
        
        System.out.println(this.name + " obtained " + this.subject1 + " marks in subject1");
        System.out.println(this.name + " obtained " + this.subject2 + " marks in subject2");
        System.out.println(this.name + " obtained " + this.subject3 + " marks in subject3");
    }
    
    String calculateResult() {
        result = (((subject1 + subject2 + subject3) * 100 ) / 300);
        return publish();
    }
    
    String changeMarks(int newMarks, String subject) {
        System.out.println(name + " has ordered a recheck in " + subject);
        
        if (subject.equals("subject1")) 
            subject1 = newMarks;
        else if (subject.equals("subject2")) 
            subject2 = newMarks;
        else if (subject.equals("subject3"))
            subject3 = newMarks;
        
        if (result >= 33.33)
            studentClass -= 1; 
                     
        return "Following is the new result: " + calculateResult();
    }
}