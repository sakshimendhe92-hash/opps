interface Filterable {
    void apply_filter();
    void reset_filter();
}

class ImageProcessor implements Filterable {
    public void apply_filter() {
        System.out.println("Image filter applied");
    }

    public void reset_filter() {
        System.out.println("Image reset");
    }
}

class DataAnalyzer implements Filterable {
    public void apply_filter() {
        System.out.println("Data filter applied");
    }

    public void reset_filter() {
        System.out.println("Data reset");
    }
}