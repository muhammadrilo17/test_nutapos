@Dao
interface DatabaseDao {
    @Insert(onConflict = OnConflictStrategy.REPLACE)
    fun insertData(uangMasuk: UangMasuk)

    @Query("SELECT COUNT(uang_masuk_id) FROM uang_masuk_table WHERE tanggal = :todayDate")
    fun getTotalOrderToday(todayDate: String): LiveData<Int>

}
