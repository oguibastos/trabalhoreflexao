import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class Reflexao {

    public static void listarAtributos(Class<?> classe) {

        System.out.println("Atributos:");

        Field[] fields = classe.getDeclaredFields();

        for (Field field : fields) {
            System.out.printf("|-Nome: %-20s |-Tipo: %-20s%n", field.getName(), field.getType().getSimpleName());
        }
    }

    public static void listarMetodos(Class<?> classe) {

        System.out.println("Métodos:");

        Method[] methods = classe.getDeclaredMethods();

        for (Method method : methods) {
            System.out.printf("|-Nome: %-20s |-Tipo: %-20s%n", method.getName(), method.getReturnType().getSimpleName());
        }
    }

    public static void listarClasseEHeranca(Object obj) {

        Class<?> classe = obj.getClass();

        System.out.println("Classe: " + classe.getName());
        listarAtributos(classe);
        listarMetodos(classe);

        Class<?> superClass = classe.getSuperclass();
        while (superClass != null && superClass != Object.class) {
            System.out.println("\nSuperclasse: " + superClass.getName());
            listarAtributos(superClass);
            listarMetodos(superClass);
            superClass = superClass.getSuperclass();
        }
    }

    public static void main(String[] args) {

        Avo avo = new Avo();
        avo.setNome("Paulin");
        avo.setIdade(77);

        Reflexao.listarClasseEHeranca(avo);
    }
}