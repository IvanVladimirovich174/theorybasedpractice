package annotations;

public @interface ClassDescription {
    String author();
    String date();
    int currentVersion() default 1;
    String[] reviewrts();
}