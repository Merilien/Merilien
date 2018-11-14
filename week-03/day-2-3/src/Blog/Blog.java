package Blog;

import java.util.ArrayList;

public class Blog {
    private ArrayList<BlogPost> posts;

    public Blog(){
    }

    public Blog(ArrayList<BlogPost> posts){
        setPosts(posts);
    }

    public void add(BlogPost post){
        posts.add(post);
    }

    public void delete(int index){
        posts.remove(index);
    }

    public void update(int index, BlogPost newPost){
        posts.set(index, newPost);
    }

    public void setPosts(ArrayList<BlogPost> posts){
        this.posts = posts;
    }
    public ArrayList<BlogPost> getPosts(){
        return posts;
    }

}
