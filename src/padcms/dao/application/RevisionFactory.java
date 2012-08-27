package padcms.dao.application;

import java.util.ArrayList;

import padcms.dao.DBApplicationSession;
import padcms.dao.application.bean.Revision;
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
public class RevisionFactory extends AbstractDao<Revision, Long> {

	public static final String TABLENAME = "Revision";

	public static class Properties {
		public final static Property id = new Property(0, Long.class, "id",
				true, "_id");
		public final static Property title = new Property(1, String.class,
				"title", false, "title");
		public final static Property state = new Property(2, String.class,
				"state", false, "state");
		public final static Property issue_id = new Property(3, Long.class,
				"issue_id", false, "issue_id");

		public final static Property cover_image_list = new Property(4,
				String.class, "cover_image_list", false, "cover_image_list");
		public final static Property created = new Property(5, String.class,
				"created", false, "created");
		public final static Property video = new Property(6, String.class,
				"video", false, "video");
		public final static Property color = new Property(7, String.class,
				"color", false, "color");
		public final static Property horizontal_mode = new Property(8,
				String.class, "horizontal_mode", false, "horizontal_mode");
		public final static Property help_page_horizontal = new Property(9,
				String.class, "help_page_horizontal", false,
				"help_page_horizontal");
		public final static Property help_page_vertical = new Property(10,
				String.class, "help_page_vertical", false, "help_page_vertical");
	};

	public RevisionFactory(DaoConfig config) {
		super(config);
	}

	public RevisionFactory(DaoConfig config, DBApplicationSession daoSession) {
		super(config, daoSession);
	}

	/** Creates the underlying database table. */
	public static void createTable(SQLiteDatabase db, boolean ifNotExists) {
		String sql = "CREATE TABLE " + (ifNotExists ? "IF NOT EXISTS " : "")
				+ "'" + TABLENAME + "' (" + "'_id' INTEGER PRIMARY KEY ,"
				+ "'title' TEXT NOT NULL ," + "'state' TEXT NOT NULL ,"
				+ "'issue_id' INTEGER NOT NULL ,"
				+ "'cover_image_list' TEXT NOT NULL ,"
				+ "'created' TEXT NOT NULL," + "'video' TEXT NOT NULL, "
				+ " 'color' TEXT NOT NULL , " + " 'horizontal_mode' TEXT ,"
				+ " 'help_page_horizontal' TEXT ,"
				+ " 'help_page_vertical' TEXT " + ");";
		db.execSQL(sql);
	}

	/** Drops the underlying database table. */
	public static void dropTable(SQLiteDatabase db, boolean ifExists) {
		String sql = "DROP TABLE " + (ifExists ? "IF EXISTS " : "") + "'"
				+ TABLENAME + "'";
		db.execSQL(sql);
	}

	/** @inheritdoc */
	@Override
	protected void bindValues(SQLiteStatement stmt, Revision entity) {
		stmt.clearBindings();

		Long id = entity.getId();
		if (id != null) {
			stmt.bindLong(1, id);
		}
		stmt.bindString(2, entity.getTitle());
		stmt.bindString(3, entity.getState());
		stmt.bindLong(4, entity.getIssue_id());
		stmt.bindString(5, entity.getCover_image_list());
		stmt.bindString(6, entity.getCreated());
		stmt.bindString(7, entity.getVideo());
		stmt.bindString(8, entity.getColor());
		stmt.bindString(9, entity.getHorizontal_mode());
		stmt.bindString(10, entity.getHelp_page_horizontal());
		stmt.bindString(11, entity.getHelp_page_vertical());

	}

	/** @inheritdoc */
	@Override
	public Long readKey(Cursor cursor, int offset) {
		return cursor.isNull(offset + 0) ? null : cursor.getLong(offset + 0);
	}

	/** @inheritdoc */
	@Override
	public Revision readEntity(Cursor cursor, int offset) {
		Revision entity = new Revision(cursor.isNull(offset + 0) ? null
				: cursor.getLong(offset + 0), cursor.getString(offset + 1),
				cursor.getString(offset + 2), cursor.getLong(offset + 3),
				cursor.getString(offset + 4), cursor.getString(offset + 5),
				cursor.getString(offset + 6),cursor.getString(offset + 7),cursor.getString(offset + 8),cursor.getString(offset + 9),cursor.getString(offset + 10));
		return entity;
	}

	/** @inheritdoc */
	@Override
	public void readEntity(Cursor cursor, Revision entity, int offset) {
		entity.setId(cursor.isNull(offset + 0) ? null : cursor
				.getLong(offset + 0));
		entity.setTitle(cursor.getString(offset + 1));
		entity.setState(cursor.getString(offset + 2));
		entity.setIssue_id(cursor.getLong(offset + 3));
		entity.setCover_image_list(cursor.getString(offset + 4));
		entity.setCreated(cursor.getString(offset + 5));
		entity.setVideo(cursor.getString(offset + 6));
		entity.setColor(cursor.getString(offset + 7));
		entity.setHorizontal_mode(cursor.getString(offset + 8));
		entity.setHelp_page_horizontal(cursor.getString(offset + 9));
		entity.setHelp_page_vertical(cursor.getString(offset + 10));
	}

	@Override
	protected Long updateKeyAfterInsert(Revision entity, long rowId) {
		entity.setId(rowId);
		return rowId;
	}

	/** @inheritdoc */
	@Override
	public Long getKey(Revision entity) {
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

	public ArrayList<Revision> loadByIssueId(Long issueId) {
		ArrayList<Revision> arrayList = new ArrayList<Revision>();
		Cursor cursor = db.query(TABLENAME, getAllColumns(),
				Properties.issue_id.columnName + "=?",
				new String[] { String.valueOf(issueId) }, null, null, null);

		if (cursor != null) {
			if (cursor.getCount() > 0) {
				cursor.moveToFirst();
				for (int i = 0; i < cursor.getCount(); i++) {
					Revision issue = readEntity(cursor, 0);
					arrayList.add(issue);
					cursor.moveToNext();
				}

			}
			cursor.close();
		}

		return arrayList;
	}

	public void insertList(ArrayList<Revision> list) {
		for (Revision revision : list) {
			insert(revision);
		}
	}

	public void updateList(ArrayList<Revision> list) {
		for (Revision revision : list) {
			update(revision);
		}
	}

}
