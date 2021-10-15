package com.TSITraining.Library;

public class Books extends Literature {
    /////////////////////////Attributes\\\\\\\\\\\\\\\\\\\\
    private String chapters;
    private String author;
    private String coverType;
    private String writingStyle;
    String genre []= {"Sci-Fi" , "Fantasy", "Romance", "Thriller", "Mystery", "Adventure", "Paranormal"};
    private Object title;


    ///////////////////////////Constructor\\\\\\\\\\\\\\\\\










    /////////////////////////Method\\\\\\\\\\\\\\\\\\\\\\\\




    public void education(String knowledge) {
        System.out.println("Reading increases reading age!");
    }

    public void borrowTime(int days) {
        System.out.println("Books can be borrowed for" + days + "days");
    }
    public void setTitle(String title) {
        final Object title1 = this.title;
    }
}
