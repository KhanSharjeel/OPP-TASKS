
class Course {
    protected String courseID;
    protected String courseTitle;
    protected int creditHours;

    public Course(String courseID, String courseTitle, int creditHours) {
        this.courseID = courseID;
        this.courseTitle = courseTitle;
        this.creditHours = creditHours;
    }

    public void showCourseDetails() {
        System.out.println("Course ID: " + courseID);
        System.out.println("Course Title: " + courseTitle);
        System.out.println("Credit Hours: " + creditHours);
    }
}


class OnlineCourse extends Course {
    protected String platformName;
    protected String instructor;
    protected int durationWeeks;

    public OnlineCourse(String courseID, String courseTitle, int creditHours,
                        String platformName, String instructor, int durationWeeks) {
        super(courseID, courseTitle, creditHours);
        this.platformName = platformName;
        this.instructor = instructor;
        this.durationWeeks = durationWeeks;
    }


    public void showCourseDetails() {
        super.showCourseDetails();
        System.out.println("Platform: " + platformName);
        System.out.println("Instructor: " + instructor);
        System.out.println("Duration (weeks): " + durationWeeks);
    }
}


class OnsiteCourse extends Course {
    protected String location;
    protected String classroomNumber;
    protected String instructor;

    public OnsiteCourse(String courseID, String courseTitle, int creditHours,
                        String location, String classroomNumber, String instructor) {
        super(courseID, courseTitle, creditHours);
        this.location = location;
        this.classroomNumber = classroomNumber;
        this.instructor = instructor;
    }


    public void showCourseDetails() {
        super.showCourseDetails();
        System.out.println("Location: " + location);
        System.out.println("Classroom: " + classroomNumber);
        System.out.println("Instructor: " + instructor);
    }
}


class Feedback {
    public void submitFeedback(String comment) {
        System.out.println("Feedback (Comment): " + comment);
    }

    public void submitFeedback(int rating) {
        System.out.println("Feedback (Rating): " + rating + "/5");
    }

    public void submitFeedback(String comment, int rating) {
        System.out.println("Feedback (Comment): " + comment);
        System.out.println("Feedback (Rating): " + rating + "/5");
    }
}


public class Main {
    public static void main(String[] args) {
        Course course1 = new OnlineCourse("OC101", "Java Programming", 3, "Coursera", "Sharjeel", 6);
        Course course2 = new OnsiteCourse("OS201", "Database Systems", 4, "Campus A", "Room 202", "Tabassum");

        System.out.println("Online Course Details");
        course1.showCourseDetails();

        System.out.println(" Onsite Course Details");
        course2.showCourseDetails();


        Feedback fb = new Feedback();
        System.out.println(" Feedback Examples ---");
        fb.submitFeedback("Great course!");
        fb.submitFeedback(4);
        fb.submitFeedback("Very informative!", 5);
    }
}
