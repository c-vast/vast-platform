package club.cvast.util;

import lombok.Data;

import java.util.List;

@Data
public class Paging<T> {
    private List<T> data;
    private Integer total;
}
