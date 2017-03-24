package builder;

/**
 * @Package: builder
 * @Description: ${todo}
 * @author: liuxin
 * @date: 17/3/24 下午6:15
 */
public class UserBuilder {
    private String name;
    private String age;
    private String address;
    private String sex;
    private String friendName;

    public  UserBuilder setName(String name){
        this.name=name;
        return this;
    }

    public  UserBuilder setAge(String age){
        this.age=age;
        return this;
    }

    public  UserBuilder setAddress(String name){
        this.address=name;
        return this;
    }

    public  UserBuilder setSex(String sex){
        this.sex=sex;
        return this;
    }


    public  UserBuilder setFriendName(String age){
        this.friendName=age;
        return this;
    }

    public User build(){
        return new User(name,age,address,sex,friendName);
    }

}
