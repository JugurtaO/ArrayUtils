public class Article {
    String name;
    String author;
    int views;

    public Article(String name, String author, int views) {
        this.name = name;
        this.author = author;
        this.views = views;
    }

    //return true if articles with name "name" exists or false if it doesn't
    static boolean searchArticle(Article[] array,String name){

        for (int i = 0; i < array.length; i++) {
            if(array[i].name== name)
                return true;
            
        }

        return false;

    }
}