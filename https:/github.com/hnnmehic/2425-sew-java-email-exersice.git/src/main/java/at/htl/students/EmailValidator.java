package at.htl.students;

@FunctionalInterface
interface EmailValidator {
    boolean isValid(String email);
}