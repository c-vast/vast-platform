package club.cvast.util;

import lombok.Data;

@Data
public class PagingUtil<T> {
    private T condition;
    private Integer page;
    private Integer limit;
    public PagingUtil(T condition,Integer page,Integer limit){
        this.condition=condition;
        if (page==null||page>0){
            this.page=getPageNumber(page,limit);
        }else {
            this.page=getPageNumber(1,limit);
        }
        if (limit==null||limit>0){
            this.limit=limit;
        }else {
            this.limit=10;
        }
    }

    private Integer getPageNumber(Integer page,Integer limit){
        return (page-1)*limit;
    }
}
