package com.example.gonggu.domain.item;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import org.hibernate.annotations.CreationTimestamp;

import javax.persistence.*;
import java.sql.Timestamp;
import java.util.Date;

@Data
@ToString(exclude = "item")
@Setter
@Getter
@Entity
public class ItemTab2 {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long tab2Id;

    @OneToOne(cascade = CascadeType.MERGE, fetch = FetchType.LAZY)
    @JoinColumn(name = "item_id")
    private Item item;

    @CreationTimestamp
    private Timestamp regDate;       // 글 등록 시점
    private String imgPath;          // 이미지 주소
    private Integer amountLimit;     // 공구 참여인원 제한
    private String contents;         // 총대의 메시지
    private Date endDate2;           // 공구 종료시점
}