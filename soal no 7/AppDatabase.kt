@Database(entities = [UangMasuk::class, Rekening::class], version = 3)
abstract class AppDatabase : RoomDatabase() {
    abstract fun databaseDao(): DatabaseDao

    companion object {
        private const val DB_NAME = "keuangan_sederhana.db"

        val MIGRATION_2_3: Migration = object : Migration(2, 3) {
            override fun migrate(database: SupportSQLiteDatabase) {
                database.execSQL(
                    "CREATE TABLE IF NOT EXISTS rekening_table (" +
                            "rekening_id INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL, " +
                            "nama_bank TEXT NOT NULL, " +
                            "nomor_rekening TEXT NOT NULL, " +
                            "atas_nama TEXT NOT NULL)"
                )

                database.execSQL("ALTER TABLE uang_masuk_table ADD COLUMN rekening_id INTEGER DEFAULT 0")
            }
        }

        fun getDatabase(context: Context): AppDatabase {
            return Room.databaseBuilder(context, AppDatabase::class.java, DB_NAME)
                .addMigrations(MIGRATION_2_3)
                .build()
        }
    }
}