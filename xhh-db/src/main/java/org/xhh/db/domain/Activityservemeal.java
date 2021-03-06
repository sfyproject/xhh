package org.xhh.db.domain;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Arrays;

public class Activityservemeal {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column activityservemeal.id
     *
     * @mbg.generated
     */
    private Integer id;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column activityservemeal.name
     *
     * @mbg.generated
     */
    private String name;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column activityservemeal.price
     *
     * @mbg.generated
     */
    private Double price;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column activityservemeal.serve
     *
     * @mbg.generated
     */
    private Integer serve;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column activityservemeal.createid
     *
     * @mbg.generated
     */
    private String createid;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column activityservemeal.createtime
     *
     * @mbg.generated
     */
    private LocalDateTime createtime;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column activityservemeal.updateid
     *
     * @mbg.generated
     */
    private String updateid;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column activityservemeal.updatetime
     *
     * @mbg.generated
     */
    private LocalDateTime updatetime;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column activityservemeal.id
     *
     * @return the value of activityservemeal.id
     *
     * @mbg.generated
     */
    public Integer getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column activityservemeal.id
     *
     * @param id the value for activityservemeal.id
     *
     * @mbg.generated
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column activityservemeal.name
     *
     * @return the value of activityservemeal.name
     *
     * @mbg.generated
     */
    public String getName() {
        return name;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column activityservemeal.name
     *
     * @param name the value for activityservemeal.name
     *
     * @mbg.generated
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column activityservemeal.price
     *
     * @return the value of activityservemeal.price
     *
     * @mbg.generated
     */
    public Double getPrice() {
        return price;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column activityservemeal.price
     *
     * @param price the value for activityservemeal.price
     *
     * @mbg.generated
     */
    public void setPrice(Double price) {
        this.price = price;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column activityservemeal.serve
     *
     * @return the value of activityservemeal.serve
     *
     * @mbg.generated
     */
    public Integer getServe() {
        return serve;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column activityservemeal.serve
     *
     * @param serve the value for activityservemeal.serve
     *
     * @mbg.generated
     */
    public void setServe(Integer serve) {
        this.serve = serve;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column activityservemeal.createid
     *
     * @return the value of activityservemeal.createid
     *
     * @mbg.generated
     */
    public String getCreateid() {
        return createid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column activityservemeal.createid
     *
     * @param createid the value for activityservemeal.createid
     *
     * @mbg.generated
     */
    public void setCreateid(String createid) {
        this.createid = createid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column activityservemeal.createtime
     *
     * @return the value of activityservemeal.createtime
     *
     * @mbg.generated
     */
    public LocalDateTime getCreatetime() {
        return createtime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column activityservemeal.createtime
     *
     * @param createtime the value for activityservemeal.createtime
     *
     * @mbg.generated
     */
    public void setCreatetime(LocalDateTime createtime) {
        this.createtime = createtime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column activityservemeal.updateid
     *
     * @return the value of activityservemeal.updateid
     *
     * @mbg.generated
     */
    public String getUpdateid() {
        return updateid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column activityservemeal.updateid
     *
     * @param updateid the value for activityservemeal.updateid
     *
     * @mbg.generated
     */
    public void setUpdateid(String updateid) {
        this.updateid = updateid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column activityservemeal.updatetime
     *
     * @return the value of activityservemeal.updatetime
     *
     * @mbg.generated
     */
    public LocalDateTime getUpdatetime() {
        return updatetime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column activityservemeal.updatetime
     *
     * @param updatetime the value for activityservemeal.updatetime
     *
     * @mbg.generated
     */
    public void setUpdatetime(LocalDateTime updatetime) {
        this.updatetime = updatetime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table activityservemeal
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
        sb.append(", serve=").append(serve);
        sb.append(", createid=").append(createid);
        sb.append(", createtime=").append(createtime);
        sb.append(", updateid=").append(updateid);
        sb.append(", updatetime=").append(updatetime);
        sb.append("]");
        return sb.toString();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table activityservemeal
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
        Activityservemeal other = (Activityservemeal) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getName() == null ? other.getName() == null : this.getName().equals(other.getName()))
            && (this.getPrice() == null ? other.getPrice() == null : this.getPrice().equals(other.getPrice()))
            && (this.getServe() == null ? other.getServe() == null : this.getServe().equals(other.getServe()))
            && (this.getCreateid() == null ? other.getCreateid() == null : this.getCreateid().equals(other.getCreateid()))
            && (this.getCreatetime() == null ? other.getCreatetime() == null : this.getCreatetime().equals(other.getCreatetime()))
            && (this.getUpdateid() == null ? other.getUpdateid() == null : this.getUpdateid().equals(other.getUpdateid()))
            && (this.getUpdatetime() == null ? other.getUpdatetime() == null : this.getUpdatetime().equals(other.getUpdatetime()));
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table activityservemeal
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
        result = prime * result + ((getServe() == null) ? 0 : getServe().hashCode());
        result = prime * result + ((getCreateid() == null) ? 0 : getCreateid().hashCode());
        result = prime * result + ((getCreatetime() == null) ? 0 : getCreatetime().hashCode());
        result = prime * result + ((getUpdateid() == null) ? 0 : getUpdateid().hashCode());
        result = prime * result + ((getUpdatetime() == null) ? 0 : getUpdatetime().hashCode());
        return result;
    }

    /**
     * This enum was generated by MyBatis Generator.
     * This enum corresponds to the database table activityservemeal
     *
     * @mbg.generated
     */
    public enum Column {
        id("id", "id", "INTEGER", false),
        name("name", "name", "VARCHAR", true),
        price("price", "price", "DOUBLE", false),
        serve("serve", "serve", "INTEGER", false),
        createid("createid", "createid", "VARCHAR", false),
        createtime("createtime", "createtime", "TIMESTAMP", false),
        updateid("updateid", "updateid", "VARCHAR", false),
        updatetime("updatetime", "updatetime", "TIMESTAMP", false);

        /**
         * This field was generated by MyBatis Generator.
         * This field corresponds to the database table activityservemeal
         *
         * @mbg.generated
         */
        private static final String BEGINNING_DELIMITER = "`";

        /**
         * This field was generated by MyBatis Generator.
         * This field corresponds to the database table activityservemeal
         *
         * @mbg.generated
         */
        private static final String ENDING_DELIMITER = "`";

        /**
         * This field was generated by MyBatis Generator.
         * This field corresponds to the database table activityservemeal
         *
         * @mbg.generated
         */
        private final String column;

        /**
         * This field was generated by MyBatis Generator.
         * This field corresponds to the database table activityservemeal
         *
         * @mbg.generated
         */
        private final boolean isColumnNameDelimited;

        /**
         * This field was generated by MyBatis Generator.
         * This field corresponds to the database table activityservemeal
         *
         * @mbg.generated
         */
        private final String javaProperty;

        /**
         * This field was generated by MyBatis Generator.
         * This field corresponds to the database table activityservemeal
         *
         * @mbg.generated
         */
        private final String jdbcType;

        /**
         * This method was generated by MyBatis Generator.
         * This method corresponds to the database table activityservemeal
         *
         * @mbg.generated
         */
        public String value() {
            return this.column;
        }

        /**
         * This method was generated by MyBatis Generator.
         * This method corresponds to the database table activityservemeal
         *
         * @mbg.generated
         */
        public String getValue() {
            return this.column;
        }

        /**
         * This method was generated by MyBatis Generator.
         * This method corresponds to the database table activityservemeal
         *
         * @mbg.generated
         */
        public String getJavaProperty() {
            return this.javaProperty;
        }

        /**
         * This method was generated by MyBatis Generator.
         * This method corresponds to the database table activityservemeal
         *
         * @mbg.generated
         */
        public String getJdbcType() {
            return this.jdbcType;
        }

        /**
         * This method was generated by MyBatis Generator.
         * This method corresponds to the database table activityservemeal
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
         * This method corresponds to the database table activityservemeal
         *
         * @mbg.generated
         */
        public String desc() {
            return this.getEscapedColumnName() + " DESC";
        }

        /**
         * This method was generated by MyBatis Generator.
         * This method corresponds to the database table activityservemeal
         *
         * @mbg.generated
         */
        public String asc() {
            return this.getEscapedColumnName() + " ASC";
        }

        /**
         * This method was generated by MyBatis Generator.
         * This method corresponds to the database table activityservemeal
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
         * This method corresponds to the database table activityservemeal
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
         * This method corresponds to the database table activityservemeal
         *
         * @mbg.generated
         */
        public String getAliasedEscapedColumnName() {
            return this.getEscapedColumnName();
        }
    }
}