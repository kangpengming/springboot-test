package yottabyte.requestmodel;

import javax.validation.constraints.NotNull;

/**
 * @author kangpeng
 * @date 2019/3/27 上午11:26
 */
public class FrontendRequest {

    @NotNull(message = "传递的数据id不能为空")
    private String id;

    @NotNull(message = "传递的数据name不能为空")
    private String name;

    @NotNull(message = "传递的数据start_time不能为空")
    private String startTime;


    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getStartTime() {
        return startTime;
    }

    public void setStart_time(String start_time) {
        this.startTime = start_time;
    }
}
