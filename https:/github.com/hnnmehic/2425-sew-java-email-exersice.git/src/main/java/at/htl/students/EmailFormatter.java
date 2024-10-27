package at.htl.students;

@FunctionalInterface
interface EmailFormatter {
    String format(String email);
}