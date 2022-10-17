package org.example;

import java.util.List;


public class GradeCalculator {

    private final List<Course> courses;
    public GradeCalculator(List<Course> courses) {
        this.courses = courses;
    }

    /**
     * 요구사항
     * 평균학점 계산 방법 = (학생수 * 교과목 평점)의 합계 / 수강신청 총 학점 수
     * 일급 컬렉션 사용
     */
    //(학생수 * 교과목 평점)의 합계
    public double calculateGrade() {
        double multipliedCreditAndCourseGrade = 0;
        for(Course course : courses) {
            multipliedCreditAndCourseGrade += course.getCredit() * course.getGradeToNumber();
        }


    // 수강신청 총학점 수
    int totalCompletedCredit = courses.stream()
            .mapToInt(course -> course.getCredit())
            .sum();

        return multipliedCreditAndCourseGrade / totalCompletedCredit;
    }
}