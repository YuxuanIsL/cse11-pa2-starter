class User{
    String username;
    String fullname;
    int follower;
    User(String username, String fullname, int follower){
        this.username = username;
        this.fullname = fullname;
        this.follower = follower;
    }

    String toText(){ return this.fullname + " " + this.username;}
}

class Tweet{
    User user;
    String contents;
    int likes;
    String id;
    Tweet(User user, String contents, int likes, String id){
        this.user = user;
        this.contents = contents;
        this.likes = likes;
        this.id = id;
    }

    boolean longerThan(Tweet other){ return this.contents.length() > other.contents.length();}
    boolean moreLikes(Tweet other){ return this.likes > other.likes;}
    String toText(){ return this.user.toText() + " : " + this.contents + " : " + Integer.toString(this.likes);}
}