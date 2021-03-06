package org.xhh.db.domain;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Arrays;

public class Activitymeal {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column activitymeal.id
     *
     * @mbg.generated
     */
    private Integer id;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column activitymeal.name
     *
     * @mbg.generated
     */
    private String name;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column activitymeal.price
     *
     * @mbg.generated
     */
    private Double price;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column activitymeal.starttime
     *
     * @mbg.generated
     */
    private String starttime;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column activitymeal.endtime
     *
     * @mbg.generated
     */
    private String endtime;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column activitymeal.createid
     *
     * @mbg.generated
     */
    private String createid;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column activitymeal.createtime
     *
     * @mbg.generated
     */
    private LocalDateTime createtime;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column activitymeal.updateid
     *
     * @mbg.generated
     */
    private String updateid;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column activitymeal.updatetime
     *
     * @mbg.generated
     */
    private LocalDateTime updatetime;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column activitymeal.id
     *
     * @return the value of activitymeal.id
     *
     * @mbg.generated
     */
    public Integer getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column activitymeal.id
     *
     * @param id the value for activitymeal.id
     *
     * @mbg.generated
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column activitymeal.name
     *
     * @return the value of activitymeal.name
     *
     * @mbg.generated
     */
    public String getName() {
        return name;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column activitymeal.name
     *
     * @param name the value for activitymeal.name
     *
     * @mbg.generated
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column activitymeal.price
     *
     * @return the value of activitymeal.price
     *
     * @mbg.generated
     */
    public Double getPrice() {
        return price;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column activitymeal.price
     *
     * @param price the value for activitymeal.price
     *
     * @mbg.generated
     */
    public void setPrice(Double price) {
        this.price = price;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column activitymeal.starttime
     *
     * @return the value of activitymeal.starttime
     *
     * @mbg.generated
     */
    public String getStarttime() {
        return starttime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column activitymeal.starttime
     *
     * @param starttime the value for activitymeal.starttime
     *
     * @mbg.generated
     */
    public void setStarttime(String starttime) {
        this.starttime = starttime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column activitymeal.endtime
     *
     * @return the value of activitymeal.endtime
     *
     * @mbg.generated
     */
    public String getEndtime() {
        return endtime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column activitymeal.endtime
     *
     * @param endtime the value for activitymeal.endtime
     *
     * @mbg.generated
     */
    public void setEndtime(String endtime) {
        this.endtime = endtime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column activitymeal.createid
     *
     * @return the value of activitymeal.createid
     *
     * @mbg.generated
     */
    public String getCreateid() {
        return createid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column activitymeal.createid
     *
     * @param createid the value for activitymeal.createid
     *
     * @mbg.generated
     */
    public void setCreateid(String createid) {
        this.createid = createid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column activitymeal.createtime
     *
     * @return the value of activitymeal.createtime
     *
     * @mbg.generated
     */
    public LocalDateTime getCreatetime() {
        return createtime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column activitymeal.createtime
     *
     * @param createtime the value for activitymeal.createtime
     *
     * @mbg.generated
     */
    public void setCreatetime(LocalDateTime createtime) {
        this.createtime = createtime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column activitymeal.updateid
     *
     * @return the value of activitymeal.updateid
     *
     * @mbg.generated
     */
    public String getUpdateid() {
        return updateid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column activitymeal.updateid
     *
     * @param updateid the value for activitymeal.updateid
     *
     * @mbg.generated
     */
    public void setUpdateid(String updateid) {
        this.updateid = updateid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column activitymeal.updatetime
     *
     * @return the value of activitymeal.updatetime
     *
     * @mbg.generated
     */
    public LocalDateTime getUpdatetime() {
        return updatetime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column activitymeal.updatetime
     *
     * @param updatetime the value for activitymeal.updatetime
     *
     * @mbg.generated
     */
    public void setUpdatetime(LocalDateTime updatetime) {
        this.updatetime = updatetime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table activitymeal
     *
     * @mbg.generated
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", name=").append(name);
        sb.append(", price=").append(price);
        sb.append(", starttime=").append(starttime);
        sb.append(", endtime=").append(endtime);
        sb.append(", createid=").append(createid);
        sb.append(", createtime=").append(createtime);
        sb.append(", updateid=").append(updateid);
        sb.append(", updatetime=").append(updatetime);
        sb.append("]");
        return sb.toString();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table activitymeal
     *
     * @mbg.generated
     */
    @Override
    public boolean equals(Object that) {
        if (this == that) {
            return true;
        }
        if (that == null) {
            return false;
        }
        if (getClass() != that.getClass()) {
            return false;
        }
        Activitymeal other = (Activitymeal) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getName() == null ? other.getName() == null : this.getName().equals(other.getName()))
            && (this.getPrice() == null ? other.getPrice() == null : this.getPrice().equals(other.getPrice()))
            && (this.getStarttime() == null ? other.getStarttime() == null : this.getStarttime().equals(other.getStarttime()))
            && (this.getEndtime() == null ? other.getEndtime() == null : this.getEndtime().equals(other.getEndtime()))
            && (this.getCreateid() == null ? other.getCreateid() == null : this.getCreateid().equals(other.getCreateid()))
            && (this.getCreatetime() == null ? other.getCreatetime() == null : this.getCreatetime().equals(other.getCreatetime()))
            && (this.getUpdateid() == null ? other.getUpdateid() == null : this.getUpdateid().equals(other.getUpdateid()))
            && (this.getUpdatetime() == null ? other.getUpdatetime() == null : this.getUpdatetime().equals(other.getUpdatetime()));
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table activitymeal
     *
     * @mbg.generated
     */
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getName() == null) ? 0 : getName().hashCode());
        result = prime * result + ((getPrice() == null) ? 0 : getPrice().hashCode());
        result = prime * result + ((getStarttime() == null) ? 0 : getStarttime().hashCode());
        result = prime * result + ((getEndtime() == null) ? 0 : getEndtime().hashCode());
        result = prime * result + ((getCreateid() == null) ? 0 : getCreateid().hashCode());
        result = prime * result + ((getCreatetime() == null) ? 0 : getCreatetime().hashCode());
        result = prime * result + ((getUpdateid() == null) ? 0 : getUpdateid().hashCode());
        result = prime * result + ((getUpdatetime() == null) ? 0 : getUpdatetime().hashCode());
        return result;
    }

    /**
     * This enum was generated by MyBatis Generator.
     * This enum corresponds to the database table activitymeal
     *
     * @mbg.generated
     */
    public enum Column {
        id("id", "id", "INTEGER", false),
        name("name", "name", "VARCHAR", true),
        price("price", "price", "DOUBLE", false),
        starttime("starttime", "starttime", "VARCHAR", false),
        endtime("endtime", "endtime", "VARCHAR", false),
        createid("createid", "createid", "VARCHAR", false),
        createtime("createtime", "createtime", "TIMESTAMP", false),
        updateid("updateid", "updateid", "VARCHAR", false),
        updatetime("updatetime", "updatetime", "TIMESTAMP", false);

        /**
         * This field was generated by MyBatis Generator.
         * This field corresponds to the database table activitymeal
         *
         * @mbg.generated
         */
        private static final String BEGINNING_DELIMITER = "`";

        /**
         * This field was generated by MyBatis Generator.
         * This field corresponds to the database table activitymeal
         *
         * @mbg.generated
         */
        private static final String ENDING_DELIMITER = "`";

        /**
         * This field was generated by MyBatis Generator.
         * This field corresponds to the database table activitymeal
         *
         * @mbg.generated
         */
        private final String column;

        /**
         * This field was generated by MyBatis Generator.
         * This field corresponds to the database table activitymeal
         *
         * @mbg.generated
         */
        private final boolean isColumnNameDelimited;

        /**
         * This field was generated by MyBatis Generator.
         * This field corresponds to the database table activitymeal
         *
         * @mbg.generated
         */
        private final String javaProperty;

        /**
         * This field was generated by MyBatis Generator.
         * This field corresponds to the database table activitymeal
         *
         * @mbg.generated
         */
        private final String jdbcType;

        /**
         * This method was generated by MyBatis Generator.
         * This method corresponds to the database table activitymeal
         *
         * @mbg.generated
         */
        public String value() {
            return this.column;
        }

        /**
         * This method was generated by MyBatis Generator.
         * This method corresponds to the database table activitymeal
         *
         * @mbg.generated
         */
        public String getValue() {
            return this.column;
        }

        /**
         * This method was generated by MyBatis Generator.
         * This method corresponds to the database table activitymeal
         *
         * @mbg.generated
         */
        public String getJavaProperty() {
            return this.javaProperty;
        }

        /**
         * This method was generated by MyBatis Generator.
         * This method corresponds to the database table activitymeal
         *
         * @mbg.generated
         */
        public String getJdbcType() {
            return this.jdbcType;
        }

        /**
         * This method was generated by MyBatis Generator.
         * This method corresponds to the database table activitymeal
         *
         * @mbg.generated
         */
        Column(String column, String javaProperty, String jdbcType, boolean isColumnNameDelimited) {
            this.column = column;
            this.javaProperty = javaProperty;
            this.jdbcType = jdbcType;
            this.isColumnNameDelimited = isColumnNameDelimited;
        }

        /**
         * This method was generated by MyBatis Generator.
         * This method corresponds to the database table activitymeal
         *
         * @mbg.generated
         */
        public String desc() {
            return this.getEscapedColumnName() + " DESC";
        }

        /**
         * This method was generated by MyBatis Generator.
         * This method corresponds to the database table activitymeal
         *
         * @mbg.generated
         */
        public String asc() {
            return this.getEscapedColumnName() + " ASC";
        }

        /**
         * This method was generated by MyBatis Generator.
         * This method corresponds to the database table activitymeal
         *
         * @mbg.generated
         */
        public static Column[] excludes(Column ... excludes) {
            ArrayList<Column> columns = new ArrayList<>(Arrays.asList(Column.values()));
            if (excludes != null && excludes.length > 0) {
                columns.removeAll(new ArrayList<>(Arrays.asList(excludes)));
            }
            return columns.toArray(new Column[]{});
        }

        /**
         * This method was generated by MyBatis Generator.
         * This method corresponds to the database table activitymeal
         *
         * @mbg.generated
         */
        public String getEscapedColumnName() {
            if (this.isColumnNameDelimited) {
                return new StringBuilder().append(BEGINNING_DELIMITER).append(this.column).append(ENDING_DELIMITER).toString();
            } else {
                return this.column;
            }
        }

        /**
         * This method was generated by MyBatis Generator.
         * This method corresponds to the database table activitymeal
         *
         * @mbg.generated
         */
        public String getAliasedEscapedColumnName() {
            return this.getEscapedColumnName();
        }
    }
}