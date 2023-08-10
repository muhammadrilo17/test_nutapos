@Entity(tableName = "rekening_table")
@Parcelize
data class Rekening(
    @PrimaryKey(autoGenerate = true)
    @ColumnInfo(name = "rekening_id")
    var rekeningId: Long = 0,

    @ColumnInfo(name = "nama_bank")
    var namaBank: String,

    @ColumnInfo(name = "nomor_rekening")
    var nomorRekening: String,

    @ColumnInfo(name = "atas_nama")
    var atasNama: String
): Parcelable
