package padcms.dao.issue;

import padcms.dao.DBIssueSession;
import padcms.dao.issue.bean.PageHorisontal;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteStatement;
import de.greenrobot.dao.AbstractDao;
import de.greenrobot.dao.DaoConfig;
import de.greenrobot.dao.Property;

// THIS CODE IS GENERATED BY greenDAO, DO NOT EDIT.
/**
 * DAO for table NOTE.
 */
public class PageHorisontalFactory extends AbstractDao<PageHorisontal, Long> {

	public static final String TABLENAME = "page_horisontal";

	public static class Properties {
		public final static Property id = new Property(0, Long.class, "id",
				true, "id");
		public final static Property name = new Property(1, String.class,
				"name", false, "name");
		public final static Property resource = new Property(2, String.class,
				"resource", false, "resource");

	};

	public PageHorisontalFactory(DaoConfig config) {
		super(config);
	}

	public PageHorisontalFactory(DaoConfig config, DBIssueSession daoSession) {
		super(config, daoSession);
	}

	// /** Creates the underlying database table. */
	// public static void createTable(SQLiteDatabase db, boolean ifNotExists) {
	// String sql = "CREATE TABLE " + (ifNotExists ? "IF NOT EXISTS " : "")
	// + "'" + TABLENAME + "' (" + "'_id' INTEGER PRIMARY KEY ,"
	// + " 'title' TEXT NOT NULL ," + "'horisontal_page_id' INTEGER NOT NULL ,"
	// + " 'template' INTEGER NOT NULL ,"
	// + " 'application_id' INTEGER NOT NULL ,"
	// + " 'paid' TEXT NOT NULL ," + " 'updated' TEXT NOT NULL ,"
	// + " 'color' TEXT NOT NULL ,"
	// + " 'subscription_type' TEXT NOT NULL" + ");";
	// db.execSQL(sql);
	// }

	/** Drops the underlying database table. */
	public static void dropTable(SQLiteDatabase db, boolean ifExists) {
		String sql = "DROP TABLE " + (ifExists ? "IF EXISTS " : "") + "'"
				+ TABLENAME + "'";
		db.execSQL(sql);
	}

	/** @inheritdoc */
	@Override
	protected void bindValues(SQLiteStatement stmt, PageHorisontal entity) {
		stmt.clearBindings();

		Long id = entity.getId();
		if (id != null) {
			stmt.bindLong(1, id);
		}
		stmt.bindString(2, entity.getName());
		stmt.bindString(3, entity.getResource());

	}

	/** @inheritdoc */
	@Override
	public Long readKey(Cursor cursor, int offset) {
		return cursor.isNull(offset + 0) ? null : cursor.getLong(offset + 0);
	}

	/** @inheritdoc */
	@Override
	public PageHorisontal readEntity(Cursor cursor, int offset) {
		PageHorisontal entity = new PageHorisontal(
				cursor.isNull(offset + 0) ? null : cursor.getLong(offset + 0), // id
				cursor.getString(offset + 1), cursor.getString(offset + 2));
		return entity;
	}

	/** @inheritdoc */
	@Override
	public void readEntity(Cursor cursor, PageHorisontal entity, int offset) {
		entity.setId(cursor.isNull(offset + 0) ? null : cursor
				.getLong(offset + 0));
		entity.setName(cursor.getString(offset + 1));
		entity.setResource(cursor.getString(offset + 2));

	}

	@Override
	protected Long updateKeyAfterInsert(PageHorisontal entity, long rowId) {
		entity.setId(rowId);
		return rowId;
	}

	/** @inheritdoc */
	@Override
	public Long getKey(PageHorisontal entity) {
		if (entity != null) {
			return entity.getId();
		} else {
			return null;
		}
	}

	/** @inheritdoc */
	@Override
	protected boolean isEntityUpdateable() {
		return true;
	}

}