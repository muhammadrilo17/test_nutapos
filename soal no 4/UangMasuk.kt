@Entity(tableName = "uang_masuk_table")
@Parcelize
data class UangMasuk(
    @PrimaryKey(autoGenerate = true)
    @ColumnInfo(name = "uang_masuk_id")
    var uangMasukId: Int = 0,

    @ColumnInfo(name = "terima_dari")
    var terimaDari: String,

    @ColumnInfo(name = "keterangan")
    var keterangan: String,

    @ColumnInfo(name = "jumlah")
    var jumlah: Double,
) : Parcelable
