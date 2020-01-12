package com.yaohua.love.db;

import java.math.BigDecimal;
import javax.persistence.*;

@Table(name = "t_test_double")
public class TTestDouble {
    @Id
    private Long id;

    @Column(name = "test_double")
    private BigDecimal testDouble;

    /**
     * @return id
     */
    public Long getId() {
        return id;
    }

    /**
     * @param id
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * @return test_double
     */
    public BigDecimal getTestDouble() {
        return testDouble;
    }

    /**
     * @param testDouble
     */
    public void setTestDouble(BigDecimal testDouble) {
        this.testDouble = testDouble;
    }
}