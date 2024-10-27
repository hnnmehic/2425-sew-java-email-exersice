package at.htl.solution;

@FunctionalInterface
interface EmailFormatter {
    String format(String email);
}