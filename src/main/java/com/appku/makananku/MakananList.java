package com.appku.makananku;

import android.os.Parcel;
import android.os.Parcelable;

public class MakananList implements Parcelable {
    public static final Parcelable.Creator<MakananList> CREATOR = new Parcelable.Creator<MakananList>() {
        @Override
        public MakananList createFromParcel(Parcel in) {
            return new MakananList(in);
        }

        @Override
        public MakananList[] newArray(int size) {
            return new MakananList[size];
        }

    };
    private String nama, pilihan, foto, penjelasan, keterangan, bahan, jenis;

    protected MakananList(Parcel in) {
        nama = in.readString();
        pilihan = in.readString();
        foto = in.readString();
        penjelasan = in.readString();
        keterangan = in.readString();
        bahan = in.readString();
        jenis = in.readString();
    }

    public MakananList() {
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getPilihan() {
        return pilihan;
    }

    public void setPilihan(String pilihan) {
        this.pilihan = pilihan;
    }

    public String getFoto() {
        return foto;
    }

    public void setFoto(String foto) {
        this.foto = foto;
    }

    public String getPenjelasan() {
        return penjelasan;
    }

    public void setPenjelasan(String penjelasan) {
        this.penjelasan = penjelasan;
    }

    public String getKeterangan() {
        return keterangan;
    }

    public void setKeterangan(String keterangan) {
        this.keterangan = keterangan;
    }

    public String getBahan() {
        return bahan;
    }

    public void setBahan(String bahan) {
        this.bahan = bahan;
    }

    public String getJenis() {
        return jenis;
    }

    public void setJenis(String jenis) {
        this.jenis = jenis;
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.nama);
        parcel.writeString(this.pilihan);
        parcel.writeString(this.foto);
        parcel.writeString(this.penjelasan);
        parcel.writeString(this.keterangan);
        parcel.writeString(this.bahan);
        parcel.writeString(this.jenis);
    }


}
