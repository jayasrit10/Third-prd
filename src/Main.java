
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int anotherStudent;

        do {

            System.out.println("========================================================");
            System.out.println("                     CAMPUSTRACK");
            System.out.println("========================================================");
            System.out.println("       Student Academic Management System");
            System.out.println("--------------------------------------------------------");

            System.out.print("Enter student ID: ");
            String studentId = sc.next();

            sc.nextLine();

            System.out.print("Enter full name: ");
            String fullName = sc.nextLine();

            // AGE VALIDATION
            int age;

            while (true) {

                System.out.print("Enter age: ");
                age = sc.nextInt();

                if (age >= 15 && age <= 35) {
                    break;
                }

                System.out.println(
                        "Invalid age. Enter a value between 15 and 35."
                );
            }

            System.out.print("Enter email: ");
            String email = sc.next();
            int courseChoice;
            String courseName = "";
            double baseFee = 0;

            while (true) {

                System.out.println();
                System.out.println("Select course:");
                System.out.println("1. BCA");
                System.out.println("2. B.Sc Computer Science");
                System.out.println("3. B.E/B.Tech");
                System.out.println("4. MCA");
                System.out.println("5. Other");

                System.out.print("Enter course choice: ");
                courseChoice = sc.nextInt();

                switch (courseChoice) {

                    case 1:
                        courseName = "BCA";
                        baseFee = 35000;
                        break;

                    case 2:
                        courseName = "B.Sc Computer Science";
                        baseFee = 30000;
                        break;

                    case 3:
                        courseName = "B.E/B.Tech";
                        baseFee = 50000;
                        break;

                    case 4:
                        courseName = "MCA";
                        baseFee = 45000;
                        break;

                    case 5:
                        courseName = "Other";
                        baseFee = 25000;
                        break;

                    default:
                        System.out.println(
                                "Invalid course choice. Select a value from 1 to 5."
                        );
                        continue;
                }

                break;
            }

            System.out.println("Course selected: " + courseName);
            int semester;

            while (true) {

                System.out.print("Enter semester (1-8): ");
                semester = sc.nextInt();

                if (semester >= 1 && semester <= 8) {
                    break;
                }

                System.out.println(
                        "Invalid semester. Enter a value between 1 and 8."
                );
            }

            sc.nextLine();

            System.out.print("Enter career goal: ");
            String careerGoal = sc.nextLine();

            int javaMarks;
            int sqlMarks;
            int webMarks;
            int aptitudeMarks;
            int communicationMarks;

            while (true) {

                System.out.print("Enter Java marks: ");
                javaMarks = sc.nextInt();

                if (javaMarks >= 0 && javaMarks <= 100) {
                    break;
                }

                System.out.println(
                        "Invalid marks. Enter a value between 0 and 100."
                );
            }

            while (true) {

                System.out.print("Enter SQL marks: ");
                sqlMarks = sc.nextInt();

                if (sqlMarks >= 0 && sqlMarks <= 100) {
                    break;
                }

                System.out.println(
                        "Invalid marks. Enter a value between 0 and 100."
                );
            }

            while (true) {

                System.out.print("Enter Web Technology marks: ");
                webMarks = sc.nextInt();

                if (webMarks >= 0 && webMarks <= 100) {
                    break;
                }

                System.out.println(
                        "Invalid marks. Enter a value between 0 and 100."
                );
            }

            while (true) {

                System.out.print("Enter Aptitude marks: ");
                aptitudeMarks = sc.nextInt();

                if (aptitudeMarks >= 0 && aptitudeMarks <= 100) {
                    break;
                }

                System.out.println(
                        "Invalid marks. Enter a value between 0 and 100."
                );
            }

            while (true) {

                System.out.print("Enter Communication marks: ");
                communicationMarks = sc.nextInt();

                if (communicationMarks >= 0 && communicationMarks <= 100) {
                    break;
                }

                System.out.println(
                        "Invalid marks. Enter a value between 0 and 100."
                );
            }

            int totalMarks
                    = javaMarks
                    + sqlMarks
                    + webMarks
                    + aptitudeMarks
                    + communicationMarks;

            double percentage = (double) totalMarks / 5;

            boolean javaFailed = javaMarks < 35;
            boolean sqlFailed = sqlMarks < 35;
            boolean webFailed = webMarks < 35;
            boolean aptitudeFailed = aptitudeMarks < 35;
            boolean communicationFailed = communicationMarks < 35;

            boolean academicPassed
                    = javaMarks >= 35
                    && sqlMarks >= 35
                    && webMarks >= 35
                    && aptitudeMarks >= 35
                    && communicationMarks >= 35
                    && percentage >= 40;

            String academicResult;
            String grade;

            if (academicPassed) {

                academicResult = "PASSED";

                if (percentage >= 85) {
                    grade = "A+";
                } else if (percentage >= 75) {
                    grade = "A";
                } else if (percentage >= 65) {
                    grade = "B";
                } else if (percentage >= 50) {
                    grade = "C";
                } else {
                    grade = "D";
                }

            } else {

                academicResult = "FAILED";
                grade = "F";
            }

            int totalClasses;

            while (true) {

                System.out.print("Enter total classes conducted: ");
                totalClasses = sc.nextInt();

                if (totalClasses >= 1 && totalClasses <= 300) {
                    break;
                }

                System.out.println(
                        "Invalid value. Total classes must be between 1 and 300."
                );
            }

            int attendedClasses;

            while (true) {

                System.out.print("Enter classes attended: ");
                attendedClasses = sc.nextInt();

                if (attendedClasses >= 0
                        && attendedClasses <= totalClasses) {

                    break;
                }

                System.out.println(
                        "Invalid attendance. Attended classes cannot exceed "
                        + totalClasses + "."
                );
            }

            double attendancePercentage
                    = ((double) attendedClasses / totalClasses) * 100;

            String attendanceStatus
                    = attendancePercentage >= 75
                            ? "REGULAR"
                            : "SHORTAGE";

            boolean attendancePassed
                    = attendancePercentage >= 75;

            int numberOfAssignments;

            while (true) {

                System.out.print(
                        "How many assignment scores do you want to enter? "
                );

                numberOfAssignments = sc.nextInt();

                if (numberOfAssignments >= 1
                        && numberOfAssignments <= 10) {

                    break;
                }

                System.out.println(
                        "Invalid number. Enter a value from 1 to 10."
                );
            }

            int assignmentTotal = 0;
            int validAssignments = 0;

            for (int i = 1; i <= numberOfAssignments; i++) {

                System.out.print(
                        "Enter score for assignment "
                        + i
                        + " (0-10, -1 to finish): "
                );

                int score = sc.nextInt();

                // -1 means finish early
                if (score == -1) {

                    System.out.println(
                            "Assignment entry completed early."
                    );

                    break;
                }

                // Invalid score
                if (score < -1 || score > 10) {

                    System.out.println(
                            "Invalid score. Assignment "
                            + i
                            + " skipped."
                    );

                    continue;
                }

                // Valid score
                assignmentTotal += score;
                validAssignments++;

                System.out.println(
                        "Assignment score accepted."
                );
            }

            double assignmentAverage;

            if (validAssignments > 0) {

                assignmentAverage
                        = (double) assignmentTotal / validAssignments;

            } else {

                assignmentAverage = 0.00;
            }

            boolean assignmentPassed
                    = validAssignments > 0
                    && assignmentAverage >= 5;

            String assignmentStatus
                    = assignmentPassed
                            ? "SATISFACTORY"
                            : "NEEDS IMPROVEMENT";

            int scholarshipPercentage;

            if (academicPassed
                    && percentage >= 85
                    && attendancePercentage >= 85) {

                scholarshipPercentage = 10;

            } else if (academicPassed
                    && percentage >= 75
                    && attendancePercentage >= 75) {

                scholarshipPercentage = 5;

            } else {

                scholarshipPercentage = 0;
            }

            double scholarshipAmount
                    = baseFee * scholarshipPercentage / 100;

            double finalPayableFee
                    = baseFee - scholarshipAmount;

            double amountPaid;

            while (true) {

                System.out.printf(
                        "Final payable fee: ₹%.2f%n",
                        finalPayableFee
                );

                System.out.print("Enter amount paid: ");
                amountPaid = sc.nextDouble();

                if (amountPaid >= 0
                        && amountPaid <= finalPayableFee) {

                    break;
                }

                System.out.printf(
                        "Invalid amount. Enter a value between ₹0 and ₹%.2f%n",
                        finalPayableFee
                );
            }

            double feeBalance
                    = finalPayableFee - amountPaid;

            String feeStatus
                    = feeBalance == 0
                            ? "PAID"
                            : "PENDING";

            boolean feePassed
                    = feeBalance == 0;

            boolean cleared
                    = academicPassed
                    && attendancePassed
                    && assignmentPassed
                    && feePassed;

            String finalStatus
                    = cleared
                            ? "CLEARED FOR NEXT SEMESTER"
                            : "ACTION REQUIRED";

            System.out.println();
            System.out.println("========================================================");
            System.out.println("                 STUDENT SEMESTER REPORT");
            System.out.println("========================================================");

            System.out.printf("%-28s : %s%n",
                    "Student ID", studentId);

            System.out.printf("%-28s : %s%n",
                    "Student Name", fullName);

            System.out.printf("%-28s : %d%n",
                    "Age", age);

            System.out.printf("%-28s : %s%n",
                    "Email", email);

            System.out.printf("%-28s : %s%n",
                    "Course", courseName);

            System.out.printf("%-28s : %d%n",
                    "Semester", semester);

            System.out.printf("%-28s : %s%n",
                    "Career Goal", careerGoal);

            System.out.println();
            System.out.println(
                    "---------------- ACADEMIC SUMMARY --------------------"
            );

            System.out.printf("%-28s : %d%n",
                    "Java Marks", javaMarks);

            System.out.printf("%-28s : %d%n",
                    "SQL Marks", sqlMarks);

            System.out.printf("%-28s : %d%n",
                    "Web Technology Marks", webMarks);

            System.out.printf("%-28s : %d%n",
                    "Aptitude Marks", aptitudeMarks);

            System.out.printf("%-28s : %d%n",
                    "Communication Marks", communicationMarks);

            System.out.printf("%-28s : %d/500%n",
                    "Total Marks", totalMarks);

            System.out.printf("%-28s : %.2f%%%n",
                    "Percentage", percentage);

            System.out.printf("%-28s : %s%n",
                    "Academic Result", academicResult);

            System.out.printf("%-28s : %s%n",
                    "Grade", grade);

            System.out.println();
            System.out.println(
                    "---------------- ATTENDANCE SUMMARY ------------------"
            );

            System.out.printf("%-28s : %d%n",
                    "Classes Conducted", totalClasses);

            System.out.printf("%-28s : %d%n",
                    "Classes Attended", attendedClasses);

            System.out.printf("%-28s : %.2f%%%n",
                    "Attendance Percentage",
                    attendancePercentage);

            System.out.printf("%-28s : %s%n",
                    "Attendance Status",
                    attendanceStatus);

            System.out.println();
            System.out.println(
                    "---------------- ASSIGNMENT SUMMARY ------------------"
            );

            System.out.printf("%-28s : %d%n",
                    "Valid Assignments",
                    validAssignments);

            System.out.printf("%-28s : %d%n",
                    "Assignment Total",
                    assignmentTotal);

            System.out.printf("%-28s : %.2f%n",
                    "Assignment Average",
                    assignmentAverage);

            System.out.printf("%-28s : %s%n",
                    "Assignment Status",
                    assignmentStatus);

            System.out.println();
            System.out.println(
                    "---------------- FEE SUMMARY -------------------------"
            );

            System.out.printf("%-28s : ₹%.2f%n",
                    "Base Semester Fee",
                    baseFee);

            System.out.printf("%-28s : %d%%%n",
                    "Scholarship Percentage",
                    scholarshipPercentage);

            System.out.printf("%-28s : ₹%.2f%n",
                    "Scholarship Amount",
                    scholarshipAmount);

            System.out.printf("%-28s : ₹%.2f%n",
                    "Final Payable Fee",
                    finalPayableFee);

            System.out.printf("%-28s : ₹%.2f%n",
                    "Amount Paid",
                    amountPaid);

            System.out.printf("%-28s : ₹%.2f%n",
                    "Fee Balance",
                    feeBalance);

            System.out.printf("%-28s : %s%n",
                    "Fee Status", feeStatus);

            System.out.println();
            System.out.println(
                    "---------------- FINAL STATUS ------------------------"
            );

            System.out.printf("%-28s : %s%n",
                    "Semester Clearance",
                    finalStatus);

            System.out.println();
            System.out.println(
                    "---------------- FAILED CONDITIONS -------------------"
            );

            boolean hasFailure = false;

            if (javaFailed) {

                System.out.println(
                        "- Java marks are below 35."
                );

                hasFailure = true;
            }

            if (sqlFailed) {

                System.out.println(
                        "- SQL marks are below 35."
                );

                hasFailure = true;
            }

            if (webFailed) {

                System.out.println(
                        "- Web Technology marks are below 35."
                );

                hasFailure = true;
            }

            if (aptitudeFailed) {

                System.out.println(
                        "- Aptitude marks are below 35."
                );

                hasFailure = true;
            }

            if (communicationFailed) {

                System.out.println(
                        "- Communication marks are below 35."
                );

                hasFailure = true;
            }

            if (percentage < 40) {

                System.out.println(
                        "- Overall percentage is below 40%."
                );

                hasFailure = true;
            }

            if (attendancePercentage < 75) {

                System.out.println(
                        "- Attendance is below 75%."
                );

                hasFailure = true;
            }

            if (validAssignments == 0) {

                System.out.println(
                        "- No valid assignment score was entered."
                );

                hasFailure = true;

            } else if (assignmentAverage < 5) {

                System.out.println(
                        "- Assignment average is below 5.00."
                );

                hasFailure = true;
            }

            if (feeBalance > 0) {

                System.out.println(
                        "- Semester fee is pending."
                );

                hasFailure = true;
            }

            if (!hasFailure) {

                System.out.println("None");
            }

            System.out.println();
            System.out.println(
                    "---------------- RECOMMENDATIONS ---------------------"
            );

            boolean recommendationDisplayed = false;

            if (javaFailed
                    || sqlFailed
                    || webFailed
                    || aptitudeFailed
                    || communicationFailed) {

                System.out.println(
                        "- Revisit the failed subject and complete "
                        + "additional practice."
                );

                recommendationDisplayed = true;
            }

            if (percentage < 40) {

                System.out.println(
                        "- Improve overall academic performance."
                );

                recommendationDisplayed = true;
            }

            if (attendancePercentage < 75) {

                System.out.println(
                        "- Attend classes regularly and clear the "
                        + "attendance shortage."
                );

                recommendationDisplayed = true;
            }

            if (validAssignments == 0
                    || assignmentAverage < 5) {

                System.out.println(
                        "- Complete assignments consistently and "
                        + "maintain an average of at least 5.00."
                );

                recommendationDisplayed = true;
            }

            if (feeBalance > 0) {

                System.out.println(
                        "- Pay the pending semester fee before clearance."
                );

                recommendationDisplayed = true;
            }

            if (!recommendationDisplayed) {

                System.out.println(
                        "- Maintain the current performance in "
                        + "the next semester."
                );
            }

            System.out.println(
                    "========================================================"
            );

            while (true) {

                System.out.println();
                System.out.println(
                        "Do you want to process another student?"
                );

                System.out.println("1. Yes");
                System.out.println("0. No");

                System.out.print("Enter choice: ");

                anotherStudent = sc.nextInt();

                if (anotherStudent == 1
                        || anotherStudent == 0) {

                    break;
                }

                System.out.println(
                        "Invalid choice. Enter 1 for Yes or 0 for No."
                );
            }

        } while (anotherStudent == 1);

        System.out.println();
        System.out.println(
                "Thank you for using CampusTrack."
        );

        sc.close();
    }
}
