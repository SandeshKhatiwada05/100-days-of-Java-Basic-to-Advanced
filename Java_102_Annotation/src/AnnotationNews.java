import java.lang.reflect.Field;

public class AnnotationNews {
    public static void main(String[] args) throws NoSuchFieldException {
        EntityClass entityClass = new EntityClass("Sandesh", "F5", 23);

        annotationInformation(entityClass);
    }

    public static void annotationInformation(EntityClass entityClass) {
//        Field[] field = entityClass.getClass().getDeclaredFields();

        int fieldCount = 1;
        for (Field indivField : entityClass.getClass().getDeclaredFields()) {
            if (indivField.isAnnotationPresent(ImportantField.class)) {
                System.out.println("\n\nCount :"+ fieldCount++);
                ImportantField annotation = indivField.getAnnotation(ImportantField.class);

                //field
                System.out.println("Field: "+indivField);

                //annotation values
                System.out.print("Annotation name: ");
                System.out.println(annotation);


                System.out.print("Field name: " );
                String name = indivField.getName();
                System.out.println(name);

                //field type
                System.out.print("Field Type from annotation: ");
                Class<?> fieldType = annotation.clazz();
                System.out.println(fieldType);

            }
        }

    }
}
