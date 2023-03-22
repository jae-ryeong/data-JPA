package study.datajpa.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter @Setter
public class Member {

    @Id @GeneratedValue
    private Long id;

    private String username;
    protected Member() {    // JPA 표준 스펙에 의해 Entity는 아무 쓸모없는 기본 생성자가 있어야한다.
        // JPA는 프록시 기술을 사용하기 때문에
    }
    public Member(String username) {
        this.username = username;
    }

    // public void change_username(String username)  이름바꾸는게 필요하면 이런 메서드를 만들면된다.


}
