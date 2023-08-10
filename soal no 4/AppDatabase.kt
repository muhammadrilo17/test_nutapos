@Database(entities = [UangMasuk::class], version = 1)
abstract class AppDatabase : RoomDatabase() {
        abstract fun databaseDao(): DatabaseDao

        companion object {
                private const val DB_NAME = "keuangan_sederhana.db"
                
                fun getDatabase(context: Context): AppDatabase {
                        return Room.databaseBuilder(context, AppDatabase::class.java, DB_NAME)
                                .build()
                }
        }
}
