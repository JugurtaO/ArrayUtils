import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        System.out.println("Enter integers to fill the array:\n");
        int[] array = new int[5];
        Scanner sc=new Scanner(System.in);
        for (int i = 0; i < array.length; i++) {
            array[i]=sc.nextInt();

        }

        System.out.println("Sum:"+ ArrayUtils.sumArray(array));

        System.out.println("Max:"+ArrayUtils.maxArray(array));

        System.out.println("Min:"+ArrayUtils.minArray(array));

        System.out.println("Sorted Array:");
        ArrayUtils.bubbleSort(array);
        ArrayUtils.printArray(array);
 
    //     Article[] articles= new Article[3];
        
    //     // Article article1=new Article("nature","victor hugo",234);
    //     // Article article2=new Article("france","amelie",2);
    //     // Article article3=new Article("paris","osmann",444);
    //     // articles[0]=article1;
    //     // articles[1]=article2;
    //     // articles[2]=article3;

    //     for (int i =0; i < articles.length; i++) {
    //         String name;
    //         String author;
    //         int views;
            
    //         System.out.println("name of the article n°"+i +" :");
    //         name=sc.nextLine();
          
            
    //         System.out.println("author:");
    //         author=sc.nextLine();
            
    //         System.out.println("number of  views:");
    //         views=sc.nextInt();
            
    //         Article article =new Article(name,author,views);
    //         articles[i]=article;

           
            
    //     }


    //    System.out.println("response after searching the article:" + Article.searchArticle(articles, "nature"));
        

        sc.close();
    }

   
}