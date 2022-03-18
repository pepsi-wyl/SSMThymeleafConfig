package pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import org.apache.ibatis.type.Alias;
import org.springframework.stereotype.Component;

/**
 * @author by pepsi-wyl
 * @date 2022-03-02 19:30
 */



@Data
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode

@Alias("books")
@Component(value = "books")
public class Books {
    private int bookID;
    private String bookName;
    private int bookCounts;
    private String detail;
}
