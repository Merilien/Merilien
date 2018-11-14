package Blog;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

        BlogPost post1 = new BlogPost();
        post1.authorName = "John Doe";
        post1.title = "Lorem Ipsum";
        post1.text = "Lorem ipsum dolor sit amet.";
        post1.publicationDate = "2000.05.04.";
        BlogPost post2 = new BlogPost();
        post2.authorName = "Tim Urban";
        post2.title = "Wait but why";
        post2.text = "A popular long-form, stick-figure-illustrated blog about almost everything.";
        post2.publicationDate = "2010.10.10.";
        BlogPost post3 = new BlogPost();
        post3.authorName = "William Turton";
        post3.title = "One Engineer Is Trying to Get IBM to Reckon With Trump";
        post3.text = "Daniel Hanley, a cybersecurity engineer at IBM, doesn’t want to be the center of " +
                "attention. When I asked to take his picture outside one of IBM’s New York City offices, he told me that he " +
                "wasn’t really into the whole organizer profile thing.";
        post3.publicationDate = "2017.03.28.";

        ArrayList<BlogPost> posts = new ArrayList<BlogPost>();
        posts.add(post1);
        posts.add(post2);
        posts.add(post3);

        Blog myBlog = new Blog(posts);
        myBlog.delete(1);

        BlogPost post4 = new BlogPost();
        post4.authorName = "Jane Doe";
        post4.title = "Lorem Ipsum";
        post4.text = "Lorem ipsum dolor sit amet.";
        post4.publicationDate = "2000.05.04.";

        System.out.println(myBlog.getPosts());
        myBlog.update(0, post4);
        System.out.println(myBlog.getPosts().get(0).authorName);

    }
}
