package com.tramovel.tour.freeboard.entity;

import com.tramovel.tour.hotel.entity.Hotel;
import lombok.*;
import org.hibernate.annotations.CreationTimestamp;

import javax.persistence.*;
import java.time.LocalDateTime;

@Entity
@Getter @Setter
@ToString(exclude = {"hotel","userNick"})
@EqualsAndHashCode(of = "id")
@NoArgsConstructor @AllArgsConstructor
@Builder
@Table
public class FreeBoard {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  @Column(name = "free_id")
  private long id;

  @Column
  private String movie; //영화 이름

  @ManyToOne
  @JoinColumn(name = "hotel_id")
  private Hotel hotel;//호텔

  @Column
  private String title; //제목

  @Column
  private String content; //내용

  @Column
  private String userNick; //작성자

  @Column
  private int star; //별점

  @CreationTimestamp
  private LocalDateTime uploadDate; //작성일
}
