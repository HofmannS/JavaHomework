package _16_12_2024;

public class Main4 {
    public static void main(String[] args) {
        Postman postman = new Postman();
        Post post = new Post(23, new Address("M. drive 85"));

        postman.delivery(post);

        System.out.println(post);

        post.doSm("qww", "ddd");
    }
}
