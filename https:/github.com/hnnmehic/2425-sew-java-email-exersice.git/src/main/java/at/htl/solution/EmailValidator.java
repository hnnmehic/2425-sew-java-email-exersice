package at.htl.solution;

@FunctionalInterface
interface EmailValidator {
    boolean isValid(String email);
}