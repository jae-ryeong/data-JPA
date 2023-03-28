package study.datajpa.entity;

import jakarta.persistence.Column;
import jakarta.persistence.MappedSuperclass;
import jakarta.persistence.PrePersist;
import jakarta.persistence.PreUpdate;
import lombok.Getter;

import java.time.LocalDateTime;

@MappedSuperclass
@Getter
public class JpaBaseEntity {

    @Column(updatable = false)  // DB의 값이 변경되지 않게해준다.
    private LocalDateTime createdDate;
    private LocalDateTime updatedDate;

    @PrePersist // 저장하기 전
    public void prePersist() {
        LocalDateTime now = LocalDateTime.now();
        this.createdDate = now;
        updatedDate = now;
    }

    @PreUpdate  // 업데이트 하기 전
    public void preUpdate() {
        updatedDate = LocalDateTime.now();
    }
}
