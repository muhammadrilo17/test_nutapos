@Database(entities = [UangMasuk::class], version = 2)
abstract class AppDatabase : RoomDatabase() {
        abstract fun databaseDao(): DatabaseDao

        companion object {
                private const val DB_NAME = "keuangan_sederhana.db"

                val MIGRATION_1_2: Migration = object : Migration(1, 2) {
                        override fun migrate(database: SupportSQLiteDatabase) {
                                database.execSQL("ALTER TABLE uang_masuk_table ADD COLUMN tanggal TEXT NOT NULL DEFAULT ''")
                                database.execSQL("ALTER TABLE uang_masuk_table ADD COLUMN nomor TEXT")
                        }
                }

                fun getDatabase(context: Context): AppDatabase {
                        return Room.databaseBuilder(context, AppDatabase::class.java, DB_NAME)
                                .addMigrations(MIGRATION_1_2)
                                .build()
                }
        }
}
