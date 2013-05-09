/**
 * This class is generated by jOOQ
 */
package org.jooq.test.jdbcoracle.generatedclasses.multi_schema.tables.records;

/**
 * This class is generated by jOOQ.
 */
@java.lang.SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class TAuthorRecord extends org.jooq.impl.TableRecordImpl<org.jooq.test.jdbcoracle.generatedclasses.multi_schema.tables.records.TAuthorRecord> implements org.jooq.Record6<java.math.BigDecimal, java.lang.String, java.lang.String, java.sql.Date, java.math.BigDecimal, java.lang.Object>, org.jooq.test.jdbcoracle.generatedclasses.multi_schema.tables.interfaces.ITAuthor {

	private static final long serialVersionUID = 1119695035;

	/**
	 * Setter for <code>MULTI_SCHEMA.T_AUTHOR.ID</code>. 
	 */
	@Override
	public void setId(java.math.BigDecimal value) {
		setValue(0, value);
	}

	/**
	 * Getter for <code>MULTI_SCHEMA.T_AUTHOR.ID</code>. 
	 */
	@Override
	public java.math.BigDecimal getId() {
		return (java.math.BigDecimal) getValue(0);
	}

	/**
	 * Setter for <code>MULTI_SCHEMA.T_AUTHOR.FIRST_NAME</code>. 
	 */
	@Override
	public void setFirstName(java.lang.String value) {
		setValue(1, value);
	}

	/**
	 * Getter for <code>MULTI_SCHEMA.T_AUTHOR.FIRST_NAME</code>. 
	 */
	@Override
	public java.lang.String getFirstName() {
		return (java.lang.String) getValue(1);
	}

	/**
	 * Setter for <code>MULTI_SCHEMA.T_AUTHOR.LAST_NAME</code>. 
	 */
	@Override
	public void setLastName(java.lang.String value) {
		setValue(2, value);
	}

	/**
	 * Getter for <code>MULTI_SCHEMA.T_AUTHOR.LAST_NAME</code>. 
	 */
	@Override
	public java.lang.String getLastName() {
		return (java.lang.String) getValue(2);
	}

	/**
	 * Setter for <code>MULTI_SCHEMA.T_AUTHOR.DATE_OF_BIRTH</code>. 
	 */
	@Override
	public void setDateOfBirth(java.sql.Date value) {
		setValue(3, value);
	}

	/**
	 * Getter for <code>MULTI_SCHEMA.T_AUTHOR.DATE_OF_BIRTH</code>. 
	 */
	@Override
	public java.sql.Date getDateOfBirth() {
		return (java.sql.Date) getValue(3);
	}

	/**
	 * Setter for <code>MULTI_SCHEMA.T_AUTHOR.YEAR_OF_BIRTH</code>. 
	 */
	@Override
	public void setYearOfBirth(java.math.BigDecimal value) {
		setValue(4, value);
	}

	/**
	 * Getter for <code>MULTI_SCHEMA.T_AUTHOR.YEAR_OF_BIRTH</code>. 
	 */
	@Override
	public java.math.BigDecimal getYearOfBirth() {
		return (java.math.BigDecimal) getValue(4);
	}

	/**
	 * Setter for <code>MULTI_SCHEMA.T_AUTHOR.ADDRESS</code>. 
	 */
	@Override
	public void setAddress(java.lang.Object value) {
		setValue(5, value);
	}

	/**
	 * Getter for <code>MULTI_SCHEMA.T_AUTHOR.ADDRESS</code>. 
	 */
	@Override
	public java.lang.Object getAddress() {
		return (java.lang.Object) getValue(5);
	}

	// -------------------------------------------------------------------------
	// Record6 type implementation
	// -------------------------------------------------------------------------

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Row6<java.math.BigDecimal, java.lang.String, java.lang.String, java.sql.Date, java.math.BigDecimal, java.lang.Object> fieldsRow() {
		return (org.jooq.Row6) super.fieldsRow();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Row6<java.math.BigDecimal, java.lang.String, java.lang.String, java.sql.Date, java.math.BigDecimal, java.lang.Object> valuesRow() {
		return (org.jooq.Row6) super.valuesRow();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.math.BigDecimal> field1() {
		return org.jooq.test.jdbcoracle.generatedclasses.multi_schema.tables.TAuthor.ID;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.String> field2() {
		return org.jooq.test.jdbcoracle.generatedclasses.multi_schema.tables.TAuthor.FIRST_NAME;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.String> field3() {
		return org.jooq.test.jdbcoracle.generatedclasses.multi_schema.tables.TAuthor.LAST_NAME;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.sql.Date> field4() {
		return org.jooq.test.jdbcoracle.generatedclasses.multi_schema.tables.TAuthor.DATE_OF_BIRTH;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.math.BigDecimal> field5() {
		return org.jooq.test.jdbcoracle.generatedclasses.multi_schema.tables.TAuthor.YEAR_OF_BIRTH;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.Object> field6() {
		return org.jooq.test.jdbcoracle.generatedclasses.multi_schema.tables.TAuthor.ADDRESS;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.math.BigDecimal value1() {
		return getId();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.String value2() {
		return getFirstName();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.String value3() {
		return getLastName();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.sql.Date value4() {
		return getDateOfBirth();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.math.BigDecimal value5() {
		return getYearOfBirth();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.Object value6() {
		return getAddress();
	}

	// -------------------------------------------------------------------------
	// FROM and INTO
	// -------------------------------------------------------------------------

	/**
	 * {@inheritDoc}
	 */
	@Override
	public void from(org.jooq.test.jdbcoracle.generatedclasses.multi_schema.tables.interfaces.ITAuthor from) {
		setId(from.getId());
		setFirstName(from.getFirstName());
		setLastName(from.getLastName());
		setDateOfBirth(from.getDateOfBirth());
		setYearOfBirth(from.getYearOfBirth());
		setAddress(from.getAddress());
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public <E extends org.jooq.test.jdbcoracle.generatedclasses.multi_schema.tables.interfaces.ITAuthor> E into(E into) {
		into.from(this);
		return into;
	}

	// -------------------------------------------------------------------------
	// Constructors
	// -------------------------------------------------------------------------

	/**
	 * Create a detached TAuthorRecord
	 */
	public TAuthorRecord() {
		super(org.jooq.test.jdbcoracle.generatedclasses.multi_schema.tables.TAuthor.T_AUTHOR);
	}
}