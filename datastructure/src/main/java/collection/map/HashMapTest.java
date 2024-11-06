package collection.map;

import collection.Collection;
import collection.arrayList.ArrayList;

public class HashMapTest {

    public static void main(String[] args) {

        HashMap<Integer, Article> articleMap = new HashMap<>();

        for ( int i = 0; i < 10; i++ ) {
            Article article = new Article(i, "제목 " + i);
            articleMap.put(i, article);
        }

//        Article findArticle = articleMap.get(2);

//        System.out.println(findArticle.toString());

        ArrayList<Article> valueList = (ArrayList<Article>) articleMap.values();

        for ( int i = 0; i < valueList.size(); i++ ) {
            Article article = valueList.get(i);
            System.out.println(article.toString());
        }

    }

    static class Article {

        private int id;
        private String title;

        public Article(int id, String title) {
            this.id = id;
            this.title = title;
        }

        @Override
        public String toString() {
            return "Article{" +
                    "id=" + id +
                    ", title='" + title + '\'' +
                    '}';
        }

    }


}
