package studentEnrollment;

class Student {
    String name;
    int studentClass;
    float result;
    
    Student(String s, int sClass) {
        this.name = s;
        this.studentClass = sClass;
        System.out.println("Added student: " + this.name +  " to the roll of class: " + this.studentClass);
    }
    
    String getName() {
        return this.name;
    }
    
    String publish() {
        if (result >= 33.33) {
            studentClass += 1;
            return name + " has been promoted to class: " + studentClass;
        }
        else {
            return name + " has been retained in class: " + studentClass;
        }        
    }
}
