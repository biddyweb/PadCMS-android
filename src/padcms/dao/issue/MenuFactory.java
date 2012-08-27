package padcms.dao.issue;

import padcms.dao.DBIssueSession;
import padcms.dao.issue.bean.Menu;
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
public class MenuFactory extends AbstractDao<Menu, Long> {

	public static final String TABLENAME = "menu";

	public static class Properties {
		public final static Property id = new Property(0, Long.class, "id",
				true, "id");
		public final static Property title = new Property(1, String.class,
				"title", false, "title");
		public final static Property firstpage_id = new Property(2, Long.class,
				"firstpage_id", false, "firstpage_id");
		public final static Property description = new Property(3,
				String.class, "description", false, "description");
		public final static Property thumb_stripe = new Property(4,
				String.class, "thumb_stripe", false, "thumb_stripe");
		public final static Property thumb_summary = new Property(5,
				String.class, "thumb_summary", false, "thumb_summary");
		public final static Property color = new Property(6, String.class,
				"color", false, "color");

	};

	public MenuFactory(DaoConfig config) {
		super(config);
	}

	public MenuFactory(DaoConfig config, DBIssueSession daoSession) {
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
	protected void bindValues(SQLiteStatement stmt, Menu entity) {
		stmt.clearBindings();

		Long id = entity.getId();
		if (id != null) {
			stmt.bindLong(1, id);
		}
		stmt.bindString(2, entity.getTitle());
		stmt.bindLong(3, entity.getFirstpage_id());
		stmt.bindString(4, entity.getDescription());
		stmt.bindString(5, entity.getThumb_stripe());
		stmt.bindString(6, entity.getThumb_summary());
		stmt.bindString(7, entity.getColor());

	}

	/** @inheritdoc */
	@Override
	public Long readKey(Cursor cursor, int offset) {
		return cursor.isNull(offset + 0) ? null : cursor.getLong(offset + 0);
	}

	/** @inheritdoc */
	@Override
	public Menu readEntity(Cursor cursor, int offset) {
		Menu entity = new Menu(
				cursor.isNull(offset + 0) ? null : cursor.getLong(offset + 0), // id
				cursor.getString(offset + 1), cursor.getLong(offset + 2),
				cursor.getString(offset + 3), cursor.getString(offset + 4),
				cursor.getString(offset + 5), cursor.getString(offset + 6));
		return entity;
	}

	/** @inheritdoc */
	@Override
	public void readEntity(Cursor cursor, Menu entity, int offset) {
		entity.setId(cursor.isNull(offset + 0) ? null : cursor
				.getLong(offset + 0));
		entity.setTitle(cursor.getString(offset + 1));
		entity.setFirstpage_id(cursor.getLong(offset + 2));
		entity.setDescription(cursor.getString(offset + 3));
		entity.setThumb_stripe(cursor.getString(offset + 4));
		entity.setThumb_summary(cursor.getString(offset + 5));
		entity.setColor(cursor.getString(offset + 6));

	}

	@Override
	protected Long updateKeyAfterInsert(Menu entity, long rowId) {
		entity.setId(rowId);
		return rowId;
	}

	/** @inheritdoc */
	@Override
	public Long getKey(Menu entity) {
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

	// public ArrayList<Issue> loadByApplicationID(Long applicationid) {
	// ArrayList<Issue> arrayList = new ArrayList<Issue>();
	// Cursor cursor = db.query(TABLENAME, getAllColumns(),
	// Properties.application_id.columnName,
	// new String[] { String.valueOf(applicationid) }, null, null,
	// null);
	// if (cursor != null) {
	// cursor.moveToFirst();
	// while (!cursor.isLast()) {
	// Issue issue = readEntity(cursor, 0);
	// arrayList.add(issue);
	// loadRevisions(issue);
	// cursor.moveToNext();
	// }
	// }
	// return arrayList;
	// }
	//
	// public void loadRevisions(Issue entity) {
	// RevisionFactory revisionFactory = ((DBSession) getSession())
	// .getRevisionFactory();
	// entity.setRevisionList(revisionFactory.loadByIssueId(entity.getId()));
	// }
	//
	// public void insertList(ArrayList<Issue> list) {
	// for (Issue issue : list) {
	// insert(issue);
	// ((DBSession) getSession()).getRevisionFactory().insertList(
	// issue.getRevisionList());
	// }
	// }
	//
	// public void updateList(ArrayList<Issue> list) {
	// for (Issue issue : list) {
	// update(issue);
	// }
	// }

}
