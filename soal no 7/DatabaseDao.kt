@Dao
interface DatabaseDao {
    // ...
    @Insert(onConflict = OnConflictStrategy.REPLACE)
    fun insertRekening(rekening: Rekening) 
}