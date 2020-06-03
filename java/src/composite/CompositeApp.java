package composite;

import java.util.Arrays;
import java.util.List;

public class CompositeApp {
    public static void main(String[] args) {
        List<Category> categories = Arrays.asList(
                new CompositeCategory("Handphone", Arrays.asList(
                        new Category("Android"),
                        new Category("IOS")
                )),
                new CompositeCategory("Compoter", Arrays.asList(
                        new Category("Laptop"),
                        new Category("PC")
                )),
                new CompositeCategory("Fashion", Arrays.asList(
                        new Category("Pria"),
                        new Category("Wanita")
                ))
        );
        
        categories.forEach(CompositeApp::printCategory);

    }

    private static void printCategory(Category category) {
        System.out.println(category.getName());

        if (category instanceof CompositeCategory) {
            CompositeCategory compositeCategory = (CompositeCategory) category;
            compositeCategory.getCategories().forEach(CompositeApp::printCategory);
        }
    }
}
